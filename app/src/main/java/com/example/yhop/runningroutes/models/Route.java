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

    @Column(name = "Date")
    private String mDate;

    @Column(name = "Location")
    private String mLocation;

    @Column(name = "Distance")
    private double mDistance;

    @Column(name = "TotalTime")
    private double mTotalTime;

    @Column(name = "Pace")
    private double mPace;

    @Column(name = "MapId")
    private int mMapId;

    @Column(name = "UserName")
    private String mUserName;

    public Route(){
        super();
    }

    public Route (String name, String date, String location, double distance, double totalTime){
        mName = name;
        mDate = date;
        mLocation = location;
        mDistance = distance;
        mTotalTime = totalTime;
    }

    public String getName() {
        return mName;
    }

    public void setName(String name) {
        mName = name;
    }

    public String getDate() { return mDate;}

    public void setDate(String date) { mDate = date; }

    public String getLocation() {
        return mLocation;
    }

    public void setLocation(String location) {
        mLocation = location;
    }

    public double getDistance() {
        return mDistance;
    }

    public void setDistance(long distance) {
        mDistance = distance;
    }

    public double getTotalTime() {
        return mTotalTime;
    }

    public void setTotalTime(long totalTime) {
        mTotalTime = totalTime;
    }

    public int getMapId() { return mMapId; }

    public void setMapId(int mapId) { mMapId = mapId; }

    public String getUser() {
        return mUserName;
    }

    public void setUser(String userName) {
        mUserName = userName;
    }

    public String getFormattedTime(Context context) {
        SimpleDateFormat formatter = new SimpleDateFormat(context.getString(R.string.formatted_time));
        formatter.setTimeZone(TimeZone.getTimeZone(context.getString(R.string.timezone)));
        return formatter.format(mTotalTime);
    }

    public static List<Route> all(){
        return new Select()
                .from(Route.class)
                .execute();
    }

    public static Route find(String location) {
        return new Select()
                .from(Route.class)
                .where("Location = ?", location)
                .executeSingle();
    }
}
