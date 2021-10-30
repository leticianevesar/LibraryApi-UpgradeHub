package com.example.library.controller;

import com.example.library.model.Book;
import com.example.library.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api")
@Validated
public class BookController {

    @Autowired
    BookService bookService;

    /**
    C - creates a new resource
    R - reads a resource
    U - updates an existing resource
    D - deletes a resource
    */

    //* GET ALL BOOKS
    @GetMapping("/books")
    public List<Book> getBooks() {
        return bookService.findAll();
    }

    //* CREATE BOOK
    @PostMapping(value ="/create-book", consumes = "application/json", produces = "application/json")
    public Book createBook(@RequestBody Book book) {
        Book newBook = Book
            .builder()
                .bookStatus(book.getBookStatus())
                .bookId(book.getBookId())
                .bookTitle(book.getBookTitle())
                .author(book.getAuthor())
                .build();
        return bookService.save(newBook);
    }

    //* GET BOOK BY ID
    @GetMapping("/book/{id}")
    public Optional<Book> getBook(Long id){

        return bookService.findById(id);
    }

    //* UPDATE BOOK BY ID
    @PutMapping(value ="update-book/{id}", consumes = "application/json", produces = "application/json")
    public ResponseEntity<Book> updateBook(@PathVariable(value = "id") Long bookId, @RequestBody Book bookDetails){
        Book book = bookService.findById(bookId).get();

        book.setBookStatus(bookDetails.getBookStatus());
        book.setBookTitle(bookDetails.getBookTitle());
        book.setBookId(bookDetails.getBookId());
        book.setAuthor(bookDetails.getAuthor());

        final Book updatedBook = bookService.save(book);
        return ResponseEntity.ok(updatedBook);
    }

    //* DELETE USER
    @DeleteMapping(value = "/delete-book/{id}")
    public void deleteBook(@PathVariable(value = "id") Long bookId) {
        bookService.deleteById(bookId);

    }
}
