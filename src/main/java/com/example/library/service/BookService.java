package com.example.library.service;

import com.example.library.model.Book;
import com.example.library.repository.BookRepository;
import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;
import java.util.List;
import java.util.Optional;

@Service
public class BookService {

    @Autowired
    BookRepository bookRepository;

    public List<Book> findAll() {

        return bookRepository.findAll();
    }

    public Optional<Book> findById(Long id) {

        return bookRepository.findById(id);
    }

    public <S extends Book> S save(S entity) {

        return bookRepository.save(entity);
    }

    public void deleteById(Long aLong) {
        bookRepository.deleteById(aLong);
    }
}
