package com.example.Book_Services.Controller;

import com.example.Book_Services.Entity.Book;
import com.example.Book_Services.Repo.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/books") // Base URL for the book API
public class MainController {

    @Autowired
    BookRepository bookRepository;

    // POST: Create a new book
    @PostMapping
    public Book createBook(@RequestBody Book book) {
        return bookRepository.save(book);
    }

    // GET: Retrieve all books
    @GetMapping
    public List<Book> getAllBooks() {
        return bookRepository.findAll();
    }

    // GET: Retrieve a book by ID
    @GetMapping("/{id}")
    public Optional<Book> getBookById(@PathVariable String id) {
        return bookRepository.findById(id);
    }

    // PUT: Update a book
    @PutMapping("/{id}")
    public Book updateBook(@PathVariable String id, @RequestBody Book book) {
        book.setBookId(book.getBookId()); // Ensure the ID matches
        return bookRepository.save(book);
    }

    // DELETE: Delete a book by ID
    @DeleteMapping("/{id}")
    public void deleteBook(@PathVariable String id) {
        bookRepository.deleteById(id);
    }
}
