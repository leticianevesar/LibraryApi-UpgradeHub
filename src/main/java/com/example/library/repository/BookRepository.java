package com.example.library.repository;
import com.example.library.model.Book;
import org.springframework.context.annotation.Primary;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
@Primary
public interface BookRepository extends JpaRepository<Book, Long> {
}