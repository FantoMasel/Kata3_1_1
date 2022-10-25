package ru.maslov.Kata3_1_1.service;
import ru.maslov.Kata3_1_1.model.User;
import java.util.List;

public interface UserService {
    List<User> AllListUser();

    void add(User user);

    void edit(int id, User user);

    void delete(int id);

    User getById(int id);
}
