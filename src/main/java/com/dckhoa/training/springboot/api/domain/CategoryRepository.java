package com.dckhoa.training.springboot.api.domain;

import java.util.List;

public interface CategoryRepository {
    List<Category> getAll();
}
