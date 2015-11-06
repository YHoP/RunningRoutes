package com.example.yhop.runningroutes.ui;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;

import com.example.yhop.runningroutes.R;
import com.example.yhop.runningroutes.data.RoutesData;
import com.example.yhop.runningroutes.data.RunnersData;
import com.parse.Parse;
import com.parse.ParseACL;
import com.parse.ParseObject;
import com.parse.ParseUser;

public class MainActivity extends AppCompatActivity {

    Runnable setData = new Runnable() {
        @Override
        public void run() {
            RunnersData mRunnersData = new RunnersData();
            RoutesData mRoutesData = new RoutesData();
        }
    };


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        // Enable Local Datastore.
        Parse.enableLocalDatastore(this);

        // Add your initialization code here
        Parse.initialize(this, "7gZ1S51W4un6sNM9isu4p2IVZzilBqStYBtPDnRa", "T4HPoBCl22o416oBfVNtx307G8IsaUFN0IitJtRe");

        ParseUser.enableAutomaticUser();
        ParseACL defaultACL = new ParseACL();
        // Optionally enable public read access.
        // defaultACL.setPublicReadAccess(true);
        ParseACL.setDefaultACL(defaultACL, true);

        ParseObject testObject = new ParseObject("TestObject");
        testObject.put("foo", "lunch");
        testObject.saveInBackground();

        RunnersData mRunnersData = new RunnersData();
        RoutesData mRoutesData = new RoutesData();

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()){
            case R.id.action_profile:
                Intent profileIntent = new Intent(this, ProfileActivity.class);
                startActivity(profileIntent);
                break;
            case  R.id.action_friends:
                Intent friendIntent = new Intent(this, FriendActivity.class);
                startActivity(friendIntent);
                break;
            case  R.id.action_maps:
                Intent mapIntent = new Intent(this, MapsActivity.class);
                startActivity(mapIntent);
                break;
            case  R.id.action_settings:
                Intent settingIntent = new Intent(this, SettingActivity.class);
                startActivity(settingIntent);
                break;
        }
        return super.onOptionsItemSelected(item);
    }
}
