package service;

import model.User;

import java.sql.SQLException;
import java.util.List;

public interface IUserService {
    void insertUser(User user);
    User selectUserById(Integer id);
    List<User> selectAllUser();
    boolean deleteUserById(Integer id);
    boolean updateUser(User user);
    List<User> searchByCountry(String country);

    List<User> sortByName();
    User getUserById(Integer id);
    void insertUserStore(User user)throws SQLException;
}
