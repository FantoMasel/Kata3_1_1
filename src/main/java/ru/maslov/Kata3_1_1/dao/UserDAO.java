package ru.maslov.Kata3_1_1.dao;


import ru.maslov.Kata3_1_1.model.User;

import java.util.List;

public interface UserDAO {
    List<User> AllListUser();

    void add(User user);

    void edit(int id, User user);

    void delete(int id);

    User getById(int id);

}
