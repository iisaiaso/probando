package com.ironman.persistence.dao;

import com.ironman.persistence.dao.Core.CrudDao;
import com.ironman.persistence.entity.Category;

//public class CategoryDao {
//
//    public List<Category> findAll() throws Exception {
//        // Attributes
//        List<Category> categories = new ArrayList<>();
//
//        Category category;
//        String sqlQuery;
//
//        // process
//        // sql query
//        sqlQuery = "select id, name, description, url_key, state, created_at, updated_at from categories";
//
//        try (
//                // Get connection
//                Connection connection = new ConnectionCore().getConnection();
//
//                // Prepare statement
//                PreparedStatement preparedStatement = connection.prepareStatement(sqlQuery);
//
//                // Execute query
//                ResultSet resultSet = preparedStatement.executeQuery();
//        ) {
//
//            // Set data
//            while (resultSet.next()) {
//                category = new Category();
//
//                category.setId(resultSet.getLong("id"));
//                category.setName(resultSet.getString("name"));
//                category.setDescription(resultSet.getString("description"));
//                category.setUrlKey(resultSet.getString("url_key"));
//                category.setState(resultSet.getString("state"));
//
//                Timestamp createdAt = resultSet.getTimestamp("created_at");
//                if (createdAt != null) {
//                    category.setCreatedAt(createdAt.toLocalDateTime());
//                }
//
//                Timestamp updatedAt = resultSet.getTimestamp("updated_at");
//                if (updatedAt != null) {
//                    category.setUpdatedAt(updatedAt.toLocalDateTime());
//                }
//
//
//                categories.add(category);
//            }
//
//        }
//
//        // result
//        return categories;
//    }
//
//    public Category findById(Long id) throws Exception {
//        //Attributes
//        Category category = null;
//        String sqlQuery;
//
//        //process
//        sqlQuery = "select id, name, description, url_key, state, created_at, updated_at from categories where id=?";
//        try (
//                //Get connection
//                Connection connection = new ConnectionCore().getConnection();
//
//                //Prepare statement
//                PreparedStatement preparedStatement = connection.prepareStatement(sqlQuery);
//
//        ) {
//            // set parameter
//            preparedStatement.setLong(1, id);
//            try (
//                    // Execute query
//                    ResultSet resultSet = preparedStatement.executeQuery();
//            ) {
//                // set data
//                if (resultSet.next()) {
//                    category = new Category();
//                    category.setId(resultSet.getLong("id"));
//                    category.setName(resultSet.getString("name"));
//                    category.setDescription(resultSet.getString("description"));
//                    category.setUrlKey(resultSet.getString("url_key"));
//
//                    Timestamp createdAt = resultSet.getTimestamp("created_at");
//                    if (createdAt != null) {
//                        category.setCreatedAt(createdAt.toLocalDateTime());
//                    }
//
//                    Timestamp updatedAt = resultSet.getTimestamp("updated_at");
//                    if (updatedAt != null) {
//                        category.setUpdatedAt(updatedAt.toLocalDateTime());
//                    }
//
//                }
//            }
//        }
//
//        //result
//        return category;
//
//    }
//}

public interface CategoryDao extends CrudDao<Category, Long> {
    /*List<Category> findAll() throws Exception;
    Category findById(Long id) throws Exception;
    int create(Category category) throws Exception;
    int update(Long id, Category category) throws Exception;
    void deleteById(Long id) throws Exception;*/
}
