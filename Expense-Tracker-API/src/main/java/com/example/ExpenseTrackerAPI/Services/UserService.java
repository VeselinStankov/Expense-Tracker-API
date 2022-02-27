package com.example.ExpenseTrackerAPI.Services;

import com.example.ExpenseTrackerAPI.Domain.User;
import com.example.ExpenseTrackerAPI.Exceptions.EtAuthException;

public interface UserService {

    User validateUser(String email, String password) throws EtAuthException;

    User registerUser(String firstName, String lastName, String email, String password) throws EtAuthException;

}
