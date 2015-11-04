package com.example.yhop.runningroutes.data;

import com.example.yhop.runningroutes.models.Route;

/**
 * Created by YHoP on 11/4/15.
 */
public class RoutesData {

    public RoutesData() {
        Route route01 = new Route("Eagle Creek Run", "05/02/2015", "Eagle Creek", 6.10, 58.20);
        Route route02 = new Route("Forest Park Walk", "06/08/2015", "Forest Park", 3.50, 43.30);
        Route route03 = new Route("Wildwood Trail", "07/24/2015", "Hoyt Arboretum", 9.50, 93.30);
        Route route04 = new Route("Sellwood Run", "08/19/2015", "Forest Park", 4.30, 48.30);
        Route route05 = new Route("Waterfront Park Run", "09/20/2015", "Portland", 6.90, 85.30);
        Route route06 = new Route("Pacific Crest Trail", "10/17/2015", "Odell Lake", 10.80, 140.30);
        Route route07 = new Route("Mt Defiance Hike", "01/22/2015", "Cascade Locks", 12.50, 220.30);
        Route route08 = new Route("Mt Hood Hike", "03/24/2015", "Government Camp", 8.20, 65.30);
        Route route09 = new Route("Portland Downtown Run", "09/15/2015", "Portland", 8.50, 72.30);
        Route route10 = new Route("Rock Creek Run", "10/28/2015", "Beaverton", 5.50, 63.30);
    }
}