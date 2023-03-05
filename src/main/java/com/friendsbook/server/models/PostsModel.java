package com.friendsbook.server.models;

public class PostsModel {
    String message;
    int userId;
    int likesCount;

    public PostsModel() {}
    public PostsModel(String message, int userId, int likesCount) {
        super();
        this.message = message;
        this.userId = userId;
        this.likesCount = likesCount;
    }
}
