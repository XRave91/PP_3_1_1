package org.xrave.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.xrave.dao.UserDao;
import org.xrave.model.User;

import java.util.List;
@Service
public class UserServiceImpl implements UserService {
    @Autowired
    UserDao  userDao;
    @Override
    public void create(User usr) {
        userDao.create(usr);
    }

    @Override
    public List getAllUsers() {
        return userDao.getAllUsers();
    }

    @Override
    public void update(User usr) {
        userDao.update(usr);
    }

    @Override

    public void delete(User usr) {
        userDao.delete(usr);
    }
}
