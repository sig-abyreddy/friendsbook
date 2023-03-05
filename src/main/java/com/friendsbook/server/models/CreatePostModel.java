package com.friendsbook.server.models;

public class CreatePostModel {
    String message;
    int userId;

    public CreatePostModel() {}

    public CreatePostModel(String message, int userId) {
        super();
        this.message = message;
        this.userId = userId;
    }

    public String getMessage() {
        return message;
    }
    public void setMessage(String message) {
        this.message = message;
    }
    
    public int getUserId() {
        return userId;
    }
    public void setUserId(int userId) {
        this.userId = userId;
    }
}
