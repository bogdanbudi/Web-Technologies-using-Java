package com.unibuc.cinema_booking.model;

import lombok.*;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class TheatreHall {

    private Long idTheatreHall;
    private Long idCinema;
    private int numberOfSeats;
    private String name;
}
