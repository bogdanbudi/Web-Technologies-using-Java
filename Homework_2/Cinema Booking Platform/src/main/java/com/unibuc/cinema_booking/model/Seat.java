package com.unibuc.cinema_booking.model;

import lombok.*;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Seat {

    private Long idSeat;
    private String categorySeat;
    private int numberSeat;
    private Boolean isReserved;
    private Long idTheatreHall;
}
