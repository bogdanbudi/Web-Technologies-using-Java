package com.unibuc.cinema_booking.model;

import lombok.*;

import java.time.LocalDateTime;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Ticket {

    private Long idTicket;
    private Long idMovieShowTime;
    private Double price;
    private int numberSeat;
    private LocalDateTime dateEvent;


}
