package com.example.library.repository;

import com.example.library.model.Category;
import org.springframework.context.annotation.Primary;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
@Primary
public interface CategoryRepository extends JpaRepository<Category, Long> {
}