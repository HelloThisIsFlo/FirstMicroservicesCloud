package com.shockn745.controller;

import com.shockn745.Util;
import com.shockn745.model.Book;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author Kempenich Florian
 */
@RestController
public class BookController {

    private final Util util;

    @Autowired
    public BookController(Util util) {
        this.util = util;
    }

    @RequestMapping(value = "/books")
    public List<Book> books() {
        return util.getBooks();
    }

    @RequestMapping(value = "/books/details/{bookId}")
    public void getBookDetails(@PathVariable String bookId) {
        System.out.println(bookId);
    }

}
