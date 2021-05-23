package com.dckhoa.training.springboot.api.controller;

import com.dckhoa.training.springboot.api.config.ApiPathConfig;
import com.dckhoa.training.springboot.api.service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CategoryController {
    private final CategoryService categoryService;

    @Autowired
    public CategoryController(final CategoryService categoryService) {
        this.categoryService = categoryService;
    }

    @GetMapping(ApiPathConfig.GET_CATEGORIES_URL)
    public CategoriesResponse getAll() {
        return new CategoriesResponse(categoryService.getAll());
    }
}
