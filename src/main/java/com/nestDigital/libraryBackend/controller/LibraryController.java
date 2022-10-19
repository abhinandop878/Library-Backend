package com.nestDigital.libraryBackend.controller;


import com.nestDigital.libraryBackend.dao.LibraryDAO;
import com.nestDigital.libraryBackend.model.LibraryModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class LibraryController {
    @Autowired
    private LibraryDAO dao;
    @CrossOrigin(origins = "*")
    @PostMapping(path = "/addBooks",consumes = "application/json",produces = "application/json")
    public String addBooks(@RequestBody LibraryModel books){
        dao.save(books);
        return "{status:'success'}";
    }
    @CrossOrigin(origins = "*")
    @GetMapping("/viewBooks")
    public List<LibraryModel> viewBooks(){
        return (List<LibraryModel>)dao.findAll();
    }
}
