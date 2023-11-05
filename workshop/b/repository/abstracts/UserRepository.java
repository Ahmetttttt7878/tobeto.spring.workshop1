package com.tobeto.spring.workshop.b.repository.abstracts;

import com.tobeto.spring.workshop.b.Modul.User;

import java.util.List;

public interface UserRepository {
    String add(User user);

    String add(com.tobeto.spring.workshop2.Modul.User user);

    List<User> getall();
    String delete(int id);
    String updateUser(int id, User updatedUser);
}