package com.unibuc.cinema_booking.mapper;

import com.unibuc.cinema_booking.dto.UserDto;
import com.unibuc.cinema_booking.dto.UserDto.UserDtoBuilder;
import com.unibuc.cinema_booking.model.User;
import com.unibuc.cinema_booking.model.User.UserBuilder;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2020-11-27T22:33:33+0200",
    comments = "version: 1.4.1.Final, compiler: javac, environment: Java 11 (Oracle Corporation)"
)
@Component
public class UserMapperImpl implements UserMapper {

    @Override
    public User mapToEntity(UserDto userDto) {
        if ( userDto == null ) {
            return null;
        }

        UserBuilder user = User.builder();

        user.username( userDto.getUsername() );
        user.password( userDto.getPassword() );
        user.name( userDto.getName() );
        user.email( userDto.getEmail() );
        user.codCategory( userDto.getCodCategory() );
        user.accountCreated( userDto.getAccountCreated() );

        return user.build();
    }

    @Override
    public UserDto mapToDto(User user) {
        if ( user == null ) {
            return null;
        }

        UserDtoBuilder userDto = UserDto.builder();

        userDto.username( user.getUsername() );
        userDto.password( user.getPassword() );
        userDto.name( user.getName() );
        userDto.email( user.getEmail() );
        userDto.codCategory( user.getCodCategory() );
        userDto.accountCreated( user.getAccountCreated() );

        return userDto.build();
    }
}
