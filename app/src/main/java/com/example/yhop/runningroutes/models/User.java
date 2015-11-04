package com.example.yhop.runningroutes.models;

import com.activeandroid.Model;
import com.activeandroid.annotation.Column;
import com.activeandroid.annotation.Table;
import com.activeandroid.query.Select;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by YHoP on 10/28/15.
 */


@Table(name = "Users", id = "_id")
public class User extends Model {

    @Column(name = "Name")
    private String mName;

    @Column(name = "Location")
    private String mLocation;

    @Column(name = "ImageId")
    private int mImageId;

    @Column(name = "TotalRoutes")
    private int mTotalRoutes;

    public User() {
        super();
    }

    public User(String name) {
        super();
        mName = name;
    }

    public String getName() {
        return mName;
    }

    public void setName(String name) {
        mName = name;
    }

    public String getLocation() {
        return mLocation;
    }

    public void setLocation(String location) {
        mLocation = location;
    }

    public int getImageId() {
        return mImageId;
    }

    public void setImageId(int imageId) {
        mImageId = imageId;
    }

    public int getTotalRoutes() { return mTotalRoutes; }

    public void setTotalRoutes(int totalRoutes) { mTotalRoutes = totalRoutes; }

    public static List<User> all(){
        return new Select()
                .from(User.class)
                .execute();
    }

    public static User find(String username) {
        return new Select()
                .from(User.class)
                .where("Name = ?", username)
                .executeSingle();
    }

    public List<Route> getRoutes(){
        List<UserRoute> joins = new Select()
                .from(UserRoute.class)
                .where("User = ?", getId())
                .execute();

        List<Route> routes = new ArrayList<>();

        for(UserRoute join : joins){
            routes.add(join.mRoute);
        }

        return routes;
    }
}