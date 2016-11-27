package com.shockn745;

import com.shockn745.model.Book;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author Kempenich Florian
 */
@RestController
public class SimpleController {

    private final Util util;

    @Autowired
    public SimpleController(Util util) {
        this.util = util;
    }

    @RequestMapping(value = "/books")
    public List<Book> books() {
        return util.getBooks();
    }

}
