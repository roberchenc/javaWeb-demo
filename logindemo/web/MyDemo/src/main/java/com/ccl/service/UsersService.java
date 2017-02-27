package com.ccl.service;

import java.util.List;

import com.ccl.entity.Users;
import com.ccl.exception.UsersException;


public interface UsersService {

    public void addUser(Users user) throws UsersException;

    public Users getUser(int id) throws UsersException;
    
    public Users getUser(String username) throws UsersException;
    
    public List<Users> getAllUsers();

    public Users updateUser(Users user) throws UsersException;

    public boolean doLogin(String username, String password) throws UsersException;
}
