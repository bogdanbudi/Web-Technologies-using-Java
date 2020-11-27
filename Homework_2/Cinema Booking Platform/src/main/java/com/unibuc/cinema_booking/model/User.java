package com.unibuc.cinema_booking.model;

import lombok.*;

import java.time.LocalDateTime;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class User {

    private String username;
    private String password;
    private String name;
    private String email;
    private EUserCategory codCategory;
    private LocalDateTime accountCreated;

}
