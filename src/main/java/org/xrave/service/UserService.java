package org.xrave.service;


import org.xrave.model.User;
import java.util.List;

public interface UserService {
    void create(User usr);
    List getAllUsers();
    void update(User usr);
    void delete(User usr);
}
