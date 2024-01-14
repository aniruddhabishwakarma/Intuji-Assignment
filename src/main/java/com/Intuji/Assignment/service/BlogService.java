package com.Intuji.Assignment.service;

import com.Intuji.Assignment.entity.BlogEntity;
import jakarta.transaction.Transactional;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Transactional
public interface BlogService {

    ResponseEntity<String> registerBlog(BlogEntity blogEntity);

    ResponseEntity<List<BlogEntity>> displayBlogs();

    ResponseEntity<BlogEntity> displayById(int id);

    ResponseEntity<String> updateBlog(BlogEntity blogEntity);
}
