package com.ironman.application.mapper;

import com.ironman.application.dto.category.CategoryDto;
import com.ironman.application.dto.category.CategorySmallDto;
import com.ironman.persistence.entity.Category;

public class CategoryMapper {
    public CategorySmallDto toSmallDto(Category category){
        CategorySmallDto categorySmallDto = new CategorySmallDto();

        categorySmallDto.setId(category.getId());
        categorySmallDto.setName(category.getName());

        return categorySmallDto;
    }

    public CategoryDto toDto(Category category){
        CategoryDto categoryDto = new CategoryDto();

        categoryDto.setId(category.getId());
        categoryDto.setName(category.getName());
        categoryDto.setDescription(category.getDescription());
        categoryDto.setUrlKey(category.getUrlKey());
        categoryDto.setState(category.getState());
        categoryDto.setCreatedAt(category.getCreatedAt());
        categoryDto.setUpdatedAt(category.getUpdatedAt());

        return categoryDto;

    }
}
