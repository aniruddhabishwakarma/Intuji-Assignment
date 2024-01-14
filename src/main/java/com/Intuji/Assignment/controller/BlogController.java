package com.Intuji.Assignment.controller;

import com.Intuji.Assignment.entity.BlogEntity;
import com.Intuji.Assignment.service.BlogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/blog")
public class BlogController {

    @Autowired
    BlogService blogService;

    @PostMapping("/register")
    public ResponseEntity<String> registerBlog(@RequestBody BlogEntity blogEntity){
        System.out.println(blogEntity);
        return blogService.registerBlog(blogEntity);
    }
    @GetMapping
    public ResponseEntity<List<BlogEntity>> displayBlogs(){
        return blogService.displayBlogs();
    }
    @GetMapping("/{id}")
    public ResponseEntity<BlogEntity> displayById(@PathVariable("id") int id){
        return blogService.displayById(id);
    }
    @PutMapping("/update")
    public ResponseEntity<String> updateBlog(@RequestBody BlogEntity blogEntity){
        return blogService.updateBlog(blogEntity);
    }
}
