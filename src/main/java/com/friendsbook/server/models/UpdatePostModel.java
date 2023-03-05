package com.friendsbook.server.models;

public class UpdatePostModel {
    int id;
    String message;
    int userId;

    public UpdatePostModel() {}
    
    public UpdatePostModel(int id, String message, int userId) {
        super();
        this.id = id;
        this.message = message;
        this.userId = userId;
    } 
}
