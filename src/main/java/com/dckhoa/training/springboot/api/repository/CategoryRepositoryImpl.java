package com.dckhoa.training.springboot.api.repository;

import com.dckhoa.training.springboot.api.domain.Category;
import com.dckhoa.training.springboot.api.domain.CategoryRepository;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class CategoryRepositoryImpl implements CategoryRepository {
    private final List<Category> categories;

    public CategoryRepositoryImpl() {
        final List<Category> categories = new ArrayList<Category>() {{
            add(new Category(1, "Category 1"));
            add(new Category(2, "Category 2"));
            add(new Category(3, "Category 3"));
        }};
        this.categories = categories;
    }

    @Override
    public List<Category> getAll() {
        return categories;
    }
}
