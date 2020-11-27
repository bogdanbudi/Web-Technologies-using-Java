package com.unibuc.cinema_booking.model;

import lombok.*;

import java.util.List;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Movie {

    private Long idMovie;
    private String name;
    private List<String> types;
    private int durationMinutes;
    private int minimumAge;
    private Boolean is3D;
}
