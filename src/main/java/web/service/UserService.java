package web.service;


import web.models.User;

import java.util.List;

public interface UserService {
    void add(User user);
    List<User> listUsers();

    List<User> getAllUsers();
    void addUser(User user);
    void deleteUser(Long id);
    void updateUser(User user);
    User getUserById(Long id);

}
