package com.example.ExpenseTrackerAPI.Repositories;

import com.example.ExpenseTrackerAPI.Domain.User;
import com.example.ExpenseTrackerAPI.Exceptions.EtAuthException;

public interface UserRepository {

    Integer create(String firstName, String lastName, String email, String password) throws EtAuthException;

    User findByEmailAndPassword(String email, String password) throws EtAuthException;

    Integer getCountByEmail(String email);

    User findById(Integer userId);

}
