package org.xrave.dao;

import org.xrave.model.User;

import java.util.List;

public interface UserDao {
    void create(User usr);
    List getAllUsers();
    void update(User usr);
    void delete(User usr);
}
