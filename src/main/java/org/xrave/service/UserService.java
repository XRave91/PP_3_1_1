package org.xrave.service;


import org.xrave.model.User;

public interface UserService {
    void create(User usr);
    Iterable<User> getAllUsers();
    void update(User usr);
    void delete(User usr);
}
