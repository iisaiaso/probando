package com.ironman.dao.Impl;

import com.ironman.dao.CategoryDao;
import com.ironman.dao.ConnectionCore;
import com.ironman.entity.Category;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;

public class CategoryStoreImpl implements CategoryDao {
    @Override
    public List<Category> findAll() throws Exception {
        // Attributes
        List<Category> categories = new ArrayList<>();

        Category category;
        String sqlQuery;

        // process
        // sql query
        sqlQuery = "select * from categories";

        try (
                // Get connection
                Connection connection = new ConnectionCore().getConnection();

                // Prepare statement
                PreparedStatement preparedStatement = connection.prepareStatement(sqlQuery);

                // Execute query
                ResultSet resultSet = preparedStatement.executeQuery();
        ) {

            // Set data
            while (resultSet.next()) {
                category = new Category();

                category.setId(resultSet.getLong("id"));
                category.setName(resultSet.getString("name"));
                category.setDescription(resultSet.getString("description"));
                category.setUrlKey(resultSet.getString("url_key"));
                category.setState(resultSet.getString("state"));

                Timestamp createdAt = resultSet.getTimestamp("created_at");
                if (createdAt != null) {
                    category.setCreatedAt(createdAt.toLocalDateTime());
                }

                Timestamp updatedAt = resultSet.getTimestamp("updated_at");
                if (updatedAt != null) {
                    category.setUpdatedAt(updatedAt.toLocalDateTime());
                }


                categories.add(category);
            }

        }
        // result
        return categories;
    }

    @Override
    public Category findById(Long id) throws Exception {
        //Attributes
        Category category = null;
        String sqlQuery;

        //process
        sqlQuery = "select id, name, description, url_key, state, created_at, updated_at from categories where id=?";
        try (
                //Get connection
                Connection connection = new ConnectionCore().getConnection();

                //Prepare statement
                PreparedStatement preparedStatement = connection.prepareStatement(sqlQuery);

        ) {
            // set parameter
            preparedStatement.setLong(1, id);
            try (
                    // Execute query
                    ResultSet resultSet = preparedStatement.executeQuery();
            ) {
                // set data
                if (resultSet.next()) {
                    category = new Category();
                    category.setId(resultSet.getLong("id"));
                    category.setName(resultSet.getString("name"));
                    category.setDescription(resultSet.getString("description"));
                    category.setUrlKey(resultSet.getString("url_key"));

                    Timestamp createdAt = resultSet.getTimestamp("created_at");
                    if (createdAt != null) {
                        category.setCreatedAt(createdAt.toLocalDateTime());
                    }

                    Timestamp updatedAt = resultSet.getTimestamp("updated_at");
                    if (updatedAt != null) {
                        category.setUpdatedAt(updatedAt.toLocalDateTime());
                    }

                }
            }
        }

        //result
        return category;
    }

    @Override
    public int create(Category category) throws Exception {
        return 0;
    }

    @Override
    public int update(Long id, Category category) throws Exception {
        return 0;
    }

    @Override
    public void deleteById(Long id) throws Exception {

    }
}
