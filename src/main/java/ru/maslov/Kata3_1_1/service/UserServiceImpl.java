package ru.maslov.Kata3_1_1.service;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import ru.maslov.Kata3_1_1.dao.UserDAO;
import ru.maslov.Kata3_1_1.model.User;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {
    private final UserDAO userDAO;

    public UserServiceImpl(UserDAO userDAO) {
        this.userDAO = userDAO;
    }


    @Override
    @Transactional
    public List<User> AllListUser() {
        return userDAO.AllListUser();
    }

    @Override
    @Transactional
    public void add(User user) {
        userDAO.add(user);


    }

    @Override
    @Transactional
    public void edit(int id, User user) {
        userDAO.edit(id, user);

    }

    @Override
    @Transactional
    public void delete(int id) {
        userDAO.delete(id);

    }

    @Override
    @Transactional
    public User getById(int id) {
        return userDAO.getById(id);
    }
}
