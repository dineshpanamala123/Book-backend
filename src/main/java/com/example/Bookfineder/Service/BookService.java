package com.example.Bookfineder.Service;

import com.example.Bookfineder.Modal.Book;
import com.example.Bookfineder.Repository.BookRepository;
import org.json.JSONObject;
import org.json.JSONArray;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.ArrayList;
import java.util.List;
@Service
public class BookService {
    private final BookRepository bookRepository;
    private final RestTemplate restTemplate = new RestTemplate();

    public BookService(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }
    public List<Book>searchBooks(String title){
        String url="https://openlibrary.org/search.json?title=" +title;
        String response = restTemplate.getForObject(url,String.class);
        JSONObject json = new JSONObject(response);
        JSONArray docs=json.getJSONArray("docs");
        List<Book>results = new ArrayList<>();
        for (int i = 0; i < Math.min(docs.length(), 10); i++) {
            JSONObject obj = docs.getJSONObject(i);
            String bookTitle = obj.optString("title");
            String author = obj.has("author_name") ? obj.getJSONArray("author_name").optString(0) : "Unknown";
            String coverUrl = obj.has("cover_i")
                    ? "https://covers.openlibrary.org/b/id/" + obj.getInt("cover_i") + "-M.jpg"
                    : "https://via.placeholder.com/80x120?text=No+Cover";

            results.add(new Book( title, author, coverUrl));
        }
        return results;
    }
    public Book saveBook(Book book){
        return bookRepository.save(book);
    }
    public List<Book>getSavedBooks(){
        return bookRepository.findAll();
    }
}
