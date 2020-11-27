package com.unibuc.cinema_booking.model;


import lombok.*;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor

public class UserCategory {

    private EUserCategory codCategory;
    private String reservationTimeLeft;
    private Double discount;

}
