package dev.sandeep.BookMyShow.model;

import dev.sandeep.BookMyShow.model.constant.PaymentMode;
import dev.sandeep.BookMyShow.model.constant.PaymentStatus;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.ManyToOne;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;

@Getter
@Setter
@Entity
public class Payment extends BaseModel{
    private LocalDateTime paymentTime;
    private double amount;
    private String referenceId;
    @ManyToOne
    private Ticket ticket;
    @Enumerated(EnumType.STRING)
    private PaymentStatus paymentStatus;
    @Enumerated(EnumType.STRING)
    private PaymentMode paymentMode;
}

/*
        Payment             Ticket
        1                   1
        M                   1

        Payment to Ticket -> M:1

        Ticket table
        TicketID
        T1
        T2
        T3

        Payment table
        PaymentId       PaymentMode   TicketId     STATUS
        P1              UPI             T1          FAILED
        P2              WALLET          T1          SUCCESS
        P3              CARD            T1          SUCCESS



 */