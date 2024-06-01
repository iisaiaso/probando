package com.ironman;

import com.ironman.dao.CategoryDao;
import com.ironman.dao.Impl.CategoryDaoImpl;
import com.ironman.dao.Impl.CategoryStoreImpl;
import com.ironman.entity.Category;

import java.time.LocalDateTime;
import java.util.List;


public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        try {
            CategoryDao categoryDao = new CategoryDaoImpl();

        // ReadList
          List<Category> categories = categoryDao.findAll();

            System.out.println("Categories start:");
            for (Category category : categories) {
                System.out.println("Id: " + category.getId());
                System.out.println("Name: " + category.getName());
                System.out.println("Description: " + category.getDescription());
                System.out.println("Url key: " + category.getUrlKey());
                System.out.println("State: " + category.getState());
                System.out.println("Created at: " + category.getCreatedAt());
                System.out.println();
            }

        // End List

        // List by id
           /*Category category = categoryDao.findById(102L);

            System.out.println("Categories start:");
            System.out.println("Id: " + category.getId());
            System.out.println("Name: " + category.getName());
            System.out.println("Description: " + category.getDescription());
            System.out.println("Url key: " + category.getUrlKey());
            System.out.println("State: " + category.getState());
            System.out.println("Created at: " + category.getCreatedAt());*/

        // End List by id

        // Create
          /*Category category = new Category();
            category.setName("Categoria A2");
            category.setDescription("Sin detalles");
            category.setUrlKey("categoria-A2");
            category.setState("A");
            category.setCreatedAt(LocalDateTime.now());

            int result = categoryDao.create(category);

            System.out.println("Create: " + result);*/
        // End create

        // Update
            /*Category category = new Category();

            category.setName("Categoria a2");
            category.setDescription("Sin detalless");
            category.setUrlKey("categoria-a2");
            category.setUpdatedAt(LocalDateTime.now());

            int result = categoryDao.update(102L,category);

            System.out.println("Update: " + result);*/

        // End Update

        // Delete
            /*categoryDao.deleteById(102L);
            System.out.println("deleteById: ");*/
        // End Delete

            System.out.println("Categories end.");
        } catch (Exception e) {
            System.out.println("Error:" + e.getMessage());
        }

    }
}