package com.ironman.dao.Impl;

import com.ironman.dao.ProductDao;
import com.ironman.entity.Category;

import java.util.List;

public class ProductDaoImpl implements ProductDao {
    @Override
    public List<Category> findAll() throws Exception {
        return List.of();
    }

    @Override
    public Category findById(Long aLong) throws Exception {
        return null;
    }

    @Override
    public int create(Category entity) throws Exception {
        return 0;
    }

    @Override
    public int update(Long aLong, Category entity) throws Exception {
        return 0;
    }

    @Override
    public void deleteById(Long aLong) throws Exception {

    }
}
