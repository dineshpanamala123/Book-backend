package com.example.Bookfineder.Repository;

import com.example.Bookfineder.Modal.Book;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookRepository extends JpaRepository<Book,Long> {

}
