package com.friendsbook.server.core;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.ArrayList;
import java.util.List;

import com.friendsbook.server.models.CreatePostModel;
import com.friendsbook.server.models.DeletePostModel;
import com.friendsbook.server.models.PostsModel;
import com.friendsbook.server.models.UpdatePostModel;

public class PostsResource {

    Connection db;

    public PostsResource() {
        try {
            this.db = DriverManager.getConnection("jdbc:mysql://localhost:3306/friendbook?serverTimezone=UTC", "root", "admin");
        }catch (Exception e) {
            e.printStackTrace();
        }
    }

    public Boolean createPost(CreatePostModel postData) {
        // write post data to database
        try {
            String statement = String.format("INSERT into posts(`message`, `user`, `likes`) values(\"%s\", %d, %d);", postData.getMessage(), postData.getUserId(), 0);
            PreparedStatement ps = db.prepareStatement(statement); 
            int res = ps.executeUpdate();
            if (res > 0) {
                return true;
            }
        }catch(Exception e) {
            e.printStackTrace();
        }
        return false;
    }

    public List<PostsModel> listPosts() {
        // fetch posts information from database

        // marshal data into Array<PostsModel>

        // return the data
        return new ArrayList<PostsModel>();
    }

    public Boolean updatePost(UpdatePostModel postData) {
        // write code to update the post data in database
        return true;
    }

    public Boolean deletePost(DeletePostModel postData){
        // write code to delete data from database
        return true;
    }
}
