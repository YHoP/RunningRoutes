package com.example.yhop.runningroutes.data;

import com.example.yhop.runningroutes.models.User;

/**
 * Created by YHoP on 11/4/15.
 */
public class UsersData {

    public UsersData(){
        User user01 = new User("Emma");
        user01.setLocation("Portland, OR");
        user01.setTotalRoutes(9);

        User user02 = new User("Noah");
        user02.setLocation("Vancouver, WA");
        user02.setTotalRoutes(8);

        User user03 = new User("Olivia");
        user03.setLocation("Milwaukie, OR");
        user03.setTotalRoutes(7);

        User user04 = new User("Jacob");
        user04.setLocation("Hillsboro, OR");
        user04.setTotalRoutes(6);

        User user05 = new User("Sophia");
        user05.setLocation("Beaverton, OR");
        user05.setTotalRoutes(5);

        User user06 = new User("William");
        user06.setLocation("Tigard, OR");
        user06.setTotalRoutes(9);

        User user07 = new User("Ava");
        user07.setLocation("Gresham, OR");
        user07.setTotalRoutes(8);

        User user08 = new User("Ethan");
        user08.setLocation("Happy Valley, OR");
        user08.setTotalRoutes(7);

        User user09 = new User("Mia");
        user09.setLocation("Lake Oswego, OR");
        user09.setTotalRoutes(6);

        User user10 = new User("James");
        user10.setLocation("Oregon City, OR");
        user10.setTotalRoutes(5);
    }
}
