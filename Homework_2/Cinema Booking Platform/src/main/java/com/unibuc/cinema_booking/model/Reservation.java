package com.unibuc.cinema_booking.model;

import lombok.*;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Reservation {

    private Long idReservation;
    private Long idUser;
    private Long idTicket;
    private Boolean itHappened;
    private Boolean itLiked;
}
