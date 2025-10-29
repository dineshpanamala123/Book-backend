package com.example.Bookfineder.Controller;

import com.example.Bookfineder.Modal.Book;
import com.example.Bookfineder.Service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/books")
@CrossOrigin(origins = "*")
public class BookController {
    private final BookService bookService;
    @Autowired
    public BookController(BookService bookService) {
        this.bookService = bookService;
    }
    @GetMapping("/search")
   public List<Book>searchBooks(@RequestParam String title){
        return bookService.searchBooks(title);
   }
   @PostMapping("/save")
   public Book saveBook(@RequestBody Book book){
        return bookService.saveBook(book);
   }
   @GetMapping("/saved")
   public List<Book>getSavedBooks(){
        return bookService.getSavedBooks();
   }
}
