package com.unibuc.cinema_booking.mapper;

import com.unibuc.cinema_booking.dto.UserDto;
import com.unibuc.cinema_booking.model.User;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface UserMapper {


    User mapToEntity(UserDto userDto);

    UserDto mapToDto(User user);
}
