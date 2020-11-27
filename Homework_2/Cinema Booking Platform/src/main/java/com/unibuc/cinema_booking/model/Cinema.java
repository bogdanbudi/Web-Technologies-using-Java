package com.unibuc.cinema_booking.model;

import lombok.*;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Cinema {
    private Long idCinema;
    private String Name;
    private Long idLocation;
}
