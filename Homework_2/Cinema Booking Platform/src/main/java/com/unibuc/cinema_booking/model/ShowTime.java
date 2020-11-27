package com.unibuc.cinema_booking.model;

import lombok.*;

import java.time.LocalDateTime;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class ShowTime {

    private Long idShowTime;
    private Long idMovie;
    private Long idTheatreHall;
    private LocalDateTime dateEvent;

}
