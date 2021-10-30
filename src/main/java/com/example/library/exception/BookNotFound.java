package com.example.library.exception;

 public class BookNotFound extends RuntimeException {

    public BookNotFound() {
        super("Book not found");
    }
    public BookNotFound(String message) {
        super(message);
    }
}