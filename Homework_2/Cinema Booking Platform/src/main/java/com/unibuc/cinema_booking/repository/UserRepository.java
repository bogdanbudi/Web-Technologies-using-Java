package com.unibuc.cinema_booking.repository;

import com.unibuc.cinema_booking.model.User;
import org.springframework.stereotype.Repository;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Optional;

@Repository
public class UserRepository implements DaoRepository<User> {

    private Long id = 0L;
    private final HashMap<Long, User> userList = new HashMap<>();

    @Override
    public User save(User user) {
        user.setAccountCreated(LocalDateTime.now());
        userList.put(id++, user);
        return user;
    }

    @Override
    public boolean delete(User object) {
        Optional<Long> userKey = userList.keySet()
                .stream()
                .filter(key -> userList.get(key).equals(object))
                .findAny();
        if (userKey.isPresent()) {
            userList.remove(userKey.get(), object);
            return true;
        }
        return false;
    }

    @Override
    public User getOne(Long id) {
        return userList.get(id);
    }

    @Override
    public List<User> getAll() {
        return new ArrayList<>(userList.values());
    }
}
