package com.example.library.service;

import com.example.library.model.Category;
import com.example.library.repository.CategoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CategoryService  {

    @Autowired
    CategoryRepository categoryRepository;

    public List<Category> findAll() {

        return categoryRepository.findAll();
    }

    public void deleteById(Long aLong) {

        categoryRepository.deleteById(aLong);
    }

    public <S extends Category> S save(S newCategory) {

        return categoryRepository.save(newCategory);
    }

    public Optional<Category> findById(Long id) {

        return categoryRepository.findById(id);
    }

}