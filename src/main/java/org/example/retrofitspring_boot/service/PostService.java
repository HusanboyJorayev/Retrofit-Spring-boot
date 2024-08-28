package org.example.retrofitspring_boot.service;

import org.example.retrofitspring_boot.model.Post;
import org.example.retrofitspring_boot.model.PostCreate;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public interface PostService {

    List<Post> getAllPosts();

    Post getPostById(int id);

    Post createPost(PostCreate post);
}
