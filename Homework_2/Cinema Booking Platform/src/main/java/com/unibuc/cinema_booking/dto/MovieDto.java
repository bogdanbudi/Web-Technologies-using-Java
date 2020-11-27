package com.unibuc.cinema_booking.dto;

import com.unibuc.cinema_booking.model.MovieType;
import lombok.*;

import java.util.List;

@Getter
@Builder
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class MovieDto {

    private String name;
    private List<MovieType> types;
    private int durationMinutes;
    private int minimumAge;
    private Boolean is3D;
}
