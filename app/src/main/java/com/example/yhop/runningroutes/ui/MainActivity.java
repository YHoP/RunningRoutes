package com.example.yhop.runningroutes.ui;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;

import com.example.yhop.runningroutes.R;
import com.example.yhop.runningroutes.data.RoutesData;
import com.example.yhop.runningroutes.data.RunnersData;
import com.parse.ParseUser;

import butterknife.ButterKnife;

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
        ButterKnife.bind(this);


        if(ParseUser.getCurrentUser() == null){
            Intent intent = new Intent(this, LogInActivity.class);
            startActivity(intent);
        }
        Toast.makeText(this, ParseUser.getCurrentUser().getUsername(), Toast.LENGTH_LONG).show();


//        RunnersData mRunnersData = new RunnersData();
//        RoutesData mRoutesData = new RoutesData();

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
