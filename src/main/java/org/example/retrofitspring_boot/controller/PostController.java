package org.example.retrofitspring_boot.controller;

import lombok.RequiredArgsConstructor;
import org.example.retrofitspring_boot.model.Post;
import org.example.retrofitspring_boot.service.PostService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("post")
public class PostController {
    private final PostService postService;

    @GetMapping("/posts")
    public List<Post> getPosts() {
        return postService.getAllPosts();
    }

    @GetMapping("/posts/{id}")
    public Post getPost(@PathVariable int id) {
        return postService.getPostById(id);
    }
}
