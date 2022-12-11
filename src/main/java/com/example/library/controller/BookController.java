package com.example.library.controller;

import com.example.library.dao.BookDao;
import com.example.library.model.BookModel;
import jakarta.persistence.GeneratedValue;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;

@RestController
public class BookController {

    @Autowired
    private BookDao bDao;

    @CrossOrigin(origins = "*")
    @PostMapping(path="/add",consumes = "application/json",produces = "application/json")
    public HashMap<String ,String> AddBooks(@RequestBody BookModel b){
        bDao.save(b);
        HashMap<String,String> map = new HashMap<>();
        map.put("status","success");
        return map;
    }

    @CrossOrigin(origins = "*")
    @GetMapping("/view")
    public List<BookModel> ViewBooks(){
        return (List<BookModel>) bDao.findAll();
    }

    @CrossOrigin(origins = "*")
    @PostMapping(path = "/search",consumes = "application/json", produces = "application/json")
    public List SearchBooks(@RequestBody BookModel b){
        String name = String.valueOf(b.getTitle());
        return (List<BookModel>)bDao.SearchBooks(b.getTitle());
    }

    @CrossOrigin(origins = "*")
    @PostMapping(path = "/delete",consumes = "application/json",produces = "application/json")
    public HashMap<String,String> DeleteBooks(@RequestBody BookModel b){
        String id = String.valueOf(b.getId());
        bDao.DeleteBooks(b.getId());
        HashMap<String,String> map = new HashMap<>();
        map.put("status","success");
        return map;
    }
}
