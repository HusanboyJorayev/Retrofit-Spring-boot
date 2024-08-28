package org.example.retrofitspring_boot.model;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class PostCreate {
    private int userId;
    private String title;
    private String body;
}
