package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class BookController {

    @Autowired
    private Book book;

    @RequestMapping("/")
    public String  getdata(){
return "Hello";
    }

    @PostMapping("/addinfo")
    public Book addInfo(@RequestBody Book b){
        book.setName(b.getName());
        book.setAuthor_name(b.getAuthor_name());
        return book;
    }
    @GetMapping("/getbook")
    public Book getinfo(){
        return book;
    }

}
