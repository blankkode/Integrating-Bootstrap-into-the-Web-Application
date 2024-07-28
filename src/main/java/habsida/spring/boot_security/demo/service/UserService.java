package habsida.spring.boot_security.demo.service;


import habsida.spring.boot_security.demo.model.User;

import java.util.List;

public interface UserService {
    List<User> getAllUsers();
    User getUserById(Long id);
    void saveUser(User user);
    void deleteUser(Long id);
    void updateUser(User user);
}
