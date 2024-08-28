package org.example.retrofitspring_boot.service;


import org.example.retrofitspring_boot.model.Post;
import org.example.retrofitspring_boot.model.PostCreate;
import org.springframework.stereotype.Component;
import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.Path;

import java.util.List;

@Component
public interface PostApi {

    @GET("/posts")
    Call<List<Post>> getPosts();

    @GET("/posts/{id}")
    Call<Post> getPostById(@Path("id") int id);

    @POST("/posts")
    Call<Post> createPost(@Body PostCreate create);
}
