package com.example.yhop.runningroutes.data;

import com.example.yhop.runningroutes.models.Runner;

/**
 * Created by YHoP on 11/4/15.
 */
public class RunnersData {

    public RunnersData(){
        Runner runner01 = new Runner("Emma");
        runner01.setLocation("Portland, OR");
        runner01.setTotalRoutes(9);
        runner01.save();

        Runner runner02 = new Runner("Noah");
        runner02.setLocation("Vancouver, WA");
        runner02.setTotalRoutes(8);
        runner02.save();

        Runner runner03 = new Runner("Olivia");
        runner03.setLocation("Milwaukie, OR");
        runner03.setTotalRoutes(7);
        runner03.save();

        Runner runner04 = new Runner("Jacob");
        runner04.setLocation("Hillsboro, OR");
        runner04.setTotalRoutes(6);
        runner04.save();

        Runner runner05 = new Runner("Sophia");
        runner05.setLocation("Beaverton, OR");
        runner05.setTotalRoutes(5);
        runner05.save();

        Runner runner06 = new Runner("William");
        runner06.setLocation("Tigard, OR");
        runner06.setTotalRoutes(9);
        runner06.save();

        Runner runner07 = new Runner("Ava");
        runner07.setLocation("Gresham, OR");
        runner07.setTotalRoutes(8);
        runner07.save();

        Runner runner08 = new Runner("Ethan");
        runner08.setLocation("Happy Valley, OR");
        runner08.setTotalRoutes(7);
        runner08.save();

        Runner runner09 = new Runner("Mia");
        runner09.setLocation("Lake Oswego, OR");
        runner09.setTotalRoutes(6);
        runner09.save();

        Runner runner10 = new Runner("James");
        runner10.setLocation("Oregon City, OR");
        runner10.setTotalRoutes(5);
        runner10.save();
    }
}
