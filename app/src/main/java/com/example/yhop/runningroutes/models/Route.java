package com.example.yhop.runningroutes.models;

import android.content.Context;

import com.activeandroid.Model;
import com.activeandroid.annotation.Column;
import com.activeandroid.annotation.Table;
import com.activeandroid.query.Select;
import com.example.yhop.runningroutes.R;

import java.text.SimpleDateFormat;
import java.util.List;
import java.util.TimeZone;

/**
 * Created by YHoP on 10/27/15.
 */
@Table(name = "Routes", id = "_id")
public class Route extends Model {

    @Column(name = "Name")
    private String mName;

    @Column(name = "Location")
    private String mLocation;

    @Column(name = "Distance")
    private long mDistance;

    @Column(name = "Time")
    private long mTime;

    @Column(name = "User")
    private String mUser;

    public Route(){
        super();
    }

    public Route (String name, String location, long distance, long time, String user){
        mName = name;
        mLocation = location;
        mDistance = distance;
        mTime = time;
        mUser = user;
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

    public long getDistance() {
        return mDistance;
    }

    public void setDistance(long distance) {
        mDistance = distance;
    }

    public long getTime() {
        return mTime;
    }

    public void setTime(long time) {
        mTime = time;
    }

    public String getUser() {
        return mUser;
    }

    public void setUser(String user) {
        mUser = user;
    }

    public String getFormattedTime(Context context) {
        SimpleDateFormat formatter = new SimpleDateFormat(context.getString("EEEE, MMMM d 'at' h:mm"));
        formatter.setTimeZone(TimeZone.getTimeZone(context.getString("PST")));
        return formatter.format(mTime);
    }

    public static List<Route> all(){
        return new Select()
                .from(Route.class)
                .execute();
    }
}
