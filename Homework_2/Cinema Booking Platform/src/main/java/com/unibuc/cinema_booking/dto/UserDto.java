package com.unibuc.cinema_booking.dto;

import com.unibuc.cinema_booking.model.EUserCategory;
import lombok.*;

import java.time.LocalDateTime;

@Getter
@Builder
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class UserDto {

    private String username;
    private String password;
    private String name;
    private String email;
    private EUserCategory codCategory;
    private LocalDateTime accountCreated;

}

