package com.ironman.dao;

import com.ironman.entity.Category;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;

public class CategoryDao {

    public List<Category> findAll() {
        // Attributes
        List<Category> categories = new ArrayList<>();

        Category category;
        String sqlQuery;

        // Se abre la coneccion y ocupan recurso en memoria.
        Connection connection = null;
        PreparedStatement preparedStatement = null;
        ResultSet resultSet = null;

        // process
        try {

            // sql query
            sqlQuery = "select id, name, description, url_key, state, created_at, updated_at from categories";

            // Get connection
            connection = new ConnectionCore().getConnection();

            // Prepare statement
            preparedStatement = connection.prepareStatement(sqlQuery);

            // Execute query
            resultSet = preparedStatement.executeQuery();

            // Set data
            while (resultSet.next()) {
                category = new Category();

                category.setId(resultSet.getLong("id"));
                category.setName(resultSet.getString("name"));
                category.setDescription(resultSet.getString("description"));
                category.setUrlKey(resultSet.getString("url_key"));
                category.setState(resultSet.getString("state"));

                Timestamp createdAt = resultSet.getTimestamp("created_at");
                if(createdAt != null) {
                    category.setCreatedAt(createdAt.toLocalDateTime());
                }

                Timestamp updatedAt = resultSet.getTimestamp("updated_at");
                if (updatedAt != null) {
                    category.setUpdatedAt(updatedAt.toLocalDateTime());
                }


                categories.add(category);
            }

        } catch (Exception e) {
            System.out.println("CategoryDao::findAll::Error: " + e.getMessage());
        }
        finally {
            try{
                if(resultSet != null){
                    resultSet.close();
                }
                if(preparedStatement != null){
                    preparedStatement.close();
                }
                if(connection != null && !connection.isClosed()){
                    connection.close();
                }
            }catch (Exception e){
                System.out.println("CategoryDao::findAll::Error:" + e.getMessage());
            }
        }


        // result

        return categories;
    }
}