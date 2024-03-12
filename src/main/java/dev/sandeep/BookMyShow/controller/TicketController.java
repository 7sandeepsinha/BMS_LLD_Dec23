package dev.sandeep.BookMyShow.controller;

import dev.sandeep.BookMyShow.dto.BookTicketRequestDTO;
import dev.sandeep.BookMyShow.service.TicketService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TicketController {

    @Autowired // create the dependency and inject inside controller
    private TicketService ticketService;

    @PostMapping("/ticket")
    public ResponseEntity bookTicket(@RequestBody BookTicketRequestDTO bookTicketRequestDTO) throws Exception {
        //validate ticket request dto
        return ResponseEntity.ok(
                ticketService.bookTicket(bookTicketRequestDTO.getShowSeatIds(), bookTicketRequestDTO.getUserId())
        );
    }

    @GetMapping("/hello")
    public ResponseEntity greet(){
        String greet = ticketService.greet();
        return ResponseEntity.ok(greet);
    }
}
