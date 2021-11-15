package dao;

import models.User;

import java.util.List;

public interface UserDao {

    //create
    void addUser(User user){}

    //read
    List<User> getAllUsers(){}
    User getUserById(int id){}

    //update

    //delete
    void deleteUsers(){}
    void deleteUserById(int id){}
}
