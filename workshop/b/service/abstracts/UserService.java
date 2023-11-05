package com.tobeto.spring.workshop.b.service.abstracts;

import com.tobeto.spring.workshop.b.Modul.User;

import java.util.List;

public interface UserService {
    List<User> getall();
    String add(User user);
    String delete(int id);
    String updateUser(int id, User updatedUser);

}