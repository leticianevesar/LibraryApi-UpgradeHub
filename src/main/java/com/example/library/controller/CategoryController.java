package com.example.library.controller;

import com.example.library.model.Category;
import com.example.library.service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api")
@Validated
public class CategoryController {

    /**
     C - creates a new resource
     R - reads a resource
     U - updates an existing resource
     D - deletes a resource
     */

    @Autowired
    CategoryService categoryService;

    //* GET ALL CATEGORIES
    @GetMapping("/categories")
    public List<Category> getCategories() {
        return categoryService.findAll();
    }

    //* CREATE CATEGORY
    @PostMapping(value ="/create-category", consumes = "application/json", produces = "application/json")
    public void createCategory(@RequestBody Category category) {
        Category newCategory = Category.builder().name(category.getName()).build();
        categoryService.save(newCategory);
    }

    //* READ CATEGORY BY ID
    @GetMapping("/category/{id}")
    public Optional<Category> getCategory(Long id){
        return categoryService.findById(id);
    }

    //* UPDATE CATEGORY BY ID
    @PutMapping(value = "updateCategory/{id}", consumes = "application/json", produces = "application/json")
    public Category updateCategory(Long id, @RequestBody Category category) {
        Optional<Category> categoryToBeUpdated = categoryService.findById(id);
        if (categoryToBeUpdated.isPresent()) {
            categoryToBeUpdated.get().setName(category.getName());
            categoryService.save(categoryToBeUpdated.get());
            return categoryToBeUpdated.get();
        } else {
            ResponseEntity.badRequest().body("Category not found");
            return null;
        }
    }

    //* DELETE CATEGORY
    @DeleteMapping(value = "/delete-category/{id}")
    public void deleteCategory(@PathVariable(value = "id") Long categoryId) {
        categoryService.deleteById(categoryId);

    }
}
