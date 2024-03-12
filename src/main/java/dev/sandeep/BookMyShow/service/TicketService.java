package dev.sandeep.BookMyShow.service;

import dev.sandeep.BookMyShow.model.ShowSeat;
import dev.sandeep.BookMyShow.model.Ticket;
import dev.sandeep.BookMyShow.model.constant.ShowSeatStatus;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class TicketService {

    @Autowired
    private ShowSeatService showSeatService;

    @Transactional(isolation = Isolation.SERIALIZABLE)
    public Ticket bookTicket(List<Integer> showSeatIds, int userId) throws Exception {
        // checking if the selected seats are available
        for(int showSeatId : showSeatIds){
            ShowSeat seat = showSeatService.getShowSeat(showSeatId);
            if(!seat.getShowSeatStatus().equals(ShowSeatStatus.AVAILABLE)){
                throw new Exception("Seat is not available anymore");
            }
        }
        // updating the seats to a locked state
        for(int showSeatId : showSeatIds){
            ShowSeat seat = showSeatService.getShowSeat(showSeatId);
            seat.setShowSeatStatus(ShowSeatStatus.LOCKED);
            showSeatService.saveShowSeat(seat);
        }

        startPayment(showSeatIds);
        return new Ticket();
    }

    public boolean startPayment(List<Integer> showSeatIds){
        return true;
    }


    public String greet(){
        return "HELLOWORLD";
    }
}
