package com.corso.java.controller;

import com.corso.java.domain.Book;
import com.corso.java.repository.BookRepository;
import com.corso.java.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path = "/api/v1")
public class BookController {

    @Autowired
    BookRepository bookRepository;

    @Autowired
    BookService bookService;

    @GetMapping(path = "/{id}")
    public ResponseEntity<Book> getBookById(@PathVariable Integer id)
    {
        return new ResponseEntity(bookRepository.getBookById(id), HttpStatus.OK);
    }

    @GetMapping(path = "/{pages}")
    public ResponseEntity<List<Book>> getBookByPages(@RequestParam Integer pages)
    {
        return new ResponseEntity(bookRepository.getBooksByPages(pages), HttpStatus.OK);
    }

    @GetMapping(path = "/{author}")
    public ResponseEntity<List<Book>> getBooksByAuthorOrName(@RequestParam String author, @RequestParam String name)
    {
        return new ResponseEntity(bookRepository.getBooksByAuthorOrName(author, name), HttpStatus.OK);
    }


    @PutMapping(path ="/{id}")
    public ResponseEntity<?> update( @PathVariable(name="id") Integer id, @RequestParam String name, @RequestParam String value) {

        bookService.updateSpecificField(name, value);
        return new ResponseEntity("Record aggiornato con successo ", HttpStatus.OK);
    }

    @PutMapping(path ="/{pages}")
    public ResponseEntity<?> updatePages(@PathVariable(name="pages") Integer pages, @RequestParam String name, @RequestParam String value) {

        bookService.updateSpecificField(name, value);
        return new ResponseEntity("Record aggiornato con successo ", HttpStatus.OK);
    }

    @PutMapping(path ="/{author}")
    public ResponseEntity<?> updateAuthor( @PathVariable(name="author") String author, @RequestParam String name, @RequestParam String value) {

        bookService.updateSpecificField(name, value);
        return new ResponseEntity("Record aggiornato con successo ", HttpStatus.OK);
    }
}
