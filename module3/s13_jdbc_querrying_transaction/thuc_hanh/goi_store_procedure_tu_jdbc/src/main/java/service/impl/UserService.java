package service.impl;

import repository.impl.UserRepository;
import model.User;
import service.IUserService;

import java.sql.SQLException;
import java.util.List;

public class UserService implements IUserService {
    UserRepository userDAO = new UserRepository();

    @Override
    public void insertUser(User user) {
        userDAO.insertUser(user);
    }

    @Override
    public User selectUserById(Integer id) {
        return userDAO.selectUser(id);
    }

    @Override
    public List<User> selectAllUser() {
        return userDAO.selectAllUser();
    }

    @Override
    public boolean deleteUserById(Integer id) {
        boolean check = userDAO.deleteUser(id);
        return check;
    }

    @Override
    public boolean updateUser(User user) {
        boolean check = userDAO.updateUser(user);
        return check;
    }

    @Override
    public List<User> searchByCountry(String country) {
        return userDAO.searchByCountry(country);
    }

    @Override
    public List<User> sortByName() {
        return userDAO.sortByName();
    }

    @Override
    public User getUserById(Integer id) {
        return userDAO.getUserById(id);
    }

    @Override
    public void insertUserStore(User user) {
        userDAO.insertUserStore(user);
    }

}
