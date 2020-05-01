package io.amin.blog.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import io.amin.blog.repositories.TagRepository;

@Service
public class TagService {
    
    @Autowired
    private TagRepository tagRepository;

}