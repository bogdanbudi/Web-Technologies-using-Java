package com.unibuc.cinema_booking.model;

import lombok.*;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Location {

    private Long idLocation;
    private String city;
    private String Street;
    private int number;
    private int postalCode;
}
