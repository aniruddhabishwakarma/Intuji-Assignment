package com.Intuji.Assignment.service;

import com.Intuji.Assignment.entity.BlogEntity;
import com.Intuji.Assignment.respository.BlogRepository;
import jakarta.transaction.Transactional;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@Transactional
public class BlogServiceImplementation implements BlogService {

    @Autowired
    BlogRepository blogRepository;

    @Override
    public ResponseEntity<String> registerBlog(BlogEntity blogEntity) {

        blogRepository.save(blogEntity);
        return new ResponseEntity<>("Blog succesfully saved", HttpStatus.OK);
    }

    @Override
    public ResponseEntity<List<BlogEntity>> displayBlogs() {
        List<BlogEntity> blogEntity = blogRepository.findAll();


        return new ResponseEntity<>(blogEntity,HttpStatus.OK);
    }

    @Override
    public ResponseEntity<BlogEntity> displayById(int id) {
        BlogEntity blogEntity = blogRepository.findById(id).get();
        return new ResponseEntity<>(blogEntity,HttpStatus.OK);
    }

    @Override
    public ResponseEntity<String> updateBlog(BlogEntity blogEntity) {
        BlogEntity blogEntity1 = blogRepository.findById(blogEntity.getId()).get();

        blogEntity1.setTitle(blogEntity.getTitle());
        blogEntity1.setDescription(blogEntity.getDescription());
        blogEntity1.setCategory(blogEntity.getCategory());
        blogRepository.save(blogEntity1);

        return new ResponseEntity<>("Blog updated successfully", HttpStatus.OK);
    }
}
