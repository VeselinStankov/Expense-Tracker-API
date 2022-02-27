package com.example.ExpenseTrackerAPI.Repositories;

import com.example.ExpenseTrackerAPI.Domain.Category;
import com.example.ExpenseTrackerAPI.Exceptions.EtBadRequestException;
import com.example.ExpenseTrackerAPI.Exceptions.EtResourceNotFoundException;

import java.util.List;

public interface CategoryRepository {

    List<Category> findAll(Integer userId) throws EtResourceNotFoundException;

    Category findById(Integer userId, Integer categoryId) throws EtResourceNotFoundException;

    Integer create(Integer userId, String title, String description) throws EtBadRequestException;

    void update(Integer userId, Integer categoryId, Category category) throws EtBadRequestException;

    void removeById(Integer userId, Integer categoryId);

}
