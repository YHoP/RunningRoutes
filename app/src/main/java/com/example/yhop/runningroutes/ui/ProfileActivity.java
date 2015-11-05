package com.example.yhop.runningroutes.ui;

import android.app.ListActivity;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.yhop.runningroutes.R;
import com.example.yhop.runningroutes.adapters.RouteAdapter;
import com.example.yhop.runningroutes.models.Route;

import java.util.ArrayList;

import butterknife.Bind;
import butterknife.ButterKnife;

public class ProfileActivity extends ListActivity {

    private ArrayList<Route> mRoutes;
    private RouteAdapter mRouteAdapter;

    @Bind(R.id.userImage) ImageView mUserImage;
    @Bind(R.id.userNameText) TextView mUserNameText;
    @Bind(R.id.locationText) TextView mLocationText;
    @Bind(R.id.lastDateText) TextView mLateDateText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        ButterKnife.bind(this);


        for (Route route : Route.all()){
            mRoutes.add(route);
        }

        mRouteAdapter = new RouteAdapter(ProfileActivity.this, mRoutes);
        setListAdapter(mRouteAdapter);
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
