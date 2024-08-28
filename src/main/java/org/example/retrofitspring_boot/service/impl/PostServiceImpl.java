package org.example.retrofitspring_boot.service.impl;

import lombok.RequiredArgsConstructor;
import org.example.retrofitspring_boot.model.Post;
import org.example.retrofitspring_boot.service.PostApi;
import org.example.retrofitspring_boot.service.PostService;
import org.example.retrofitspring_boot.util.RetrofitUtil;
import org.springframework.stereotype.Service;
import retrofit2.Call;
import retrofit2.Retrofit;

import java.io.IOException;
import java.util.List;

@Service
public class PostServiceImpl implements PostService {

    private Retrofit retrofit;
    private PostApi postApi;

    public PostServiceImpl() {
        retrofit = RetrofitUtil.getRetrofit();
        postApi = retrofit.create(PostApi.class);
    }

    @Override
    public List<Post> getAllPosts() {
        Call<List<Post>> posts = postApi.getPosts();
        List<Post> response;
        try {
            response = posts.execute().body();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        return response;
    }

    @Override
    public Post getPostById(int id) {
        Post post;
        Call<Post> getPost = postApi.getPostById(id);
        try {
            post = getPost.execute().body();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        return post;
    }
}
