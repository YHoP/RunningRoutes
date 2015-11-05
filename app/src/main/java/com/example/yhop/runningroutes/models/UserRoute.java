package com.example.yhop.runningroutes.models;

import com.activeandroid.Model;
import com.activeandroid.annotation.Column;
import com.activeandroid.annotation.Table;


/**
 * Created by YHoP on 11/3/15.
 */

@Table(name = "User_Route", id = "_id")
public class UserRoute extends Model{
    @Column(name = "Runner")
    public Runner mRunner;

    @Column(name = "Route")
    public Route mRoute;

    public UserRoute() {super();}

    public UserRoute(Runner runner, Route route){
        super();
        mRunner = runner;
        mRoute = route;
    }

}
