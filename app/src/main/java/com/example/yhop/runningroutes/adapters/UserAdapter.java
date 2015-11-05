package com.example.yhop.runningroutes.adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.yhop.runningroutes.R;
import com.example.yhop.runningroutes.models.Route;
import com.example.yhop.runningroutes.models.Runner;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by YHoP on 11/3/15.
 */
public class UserAdapter extends BaseAdapter {

    private Context mContext;
    private ArrayList<Runner> mRunners;

    public UserAdapter(Context context, ArrayList<Runner> runners) {
        mRunners = runners;
        mContext = context;
    }

    public Context getContext() {
        return mContext;
    }
    @Override
    public int getCount() {
        return mRunners.size();
    }

    @Override
    public Object getItem(int position) {
        return mRunners.get(position);
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        ViewHolder holder;

        if (convertView == null) {
            convertView = LayoutInflater.from(mContext).inflate(R.layout.runner_list_item, null);
            holder = new ViewHolder();
            holder.userImage = (ImageView) convertView.findViewById(R.id.userImage);
            holder.userNameText = (TextView) convertView.findViewById(R.id.userNameText);
            holder.locationText = (TextView) convertView.findViewById(R.id.locationText);
            holder.routeCountText = (TextView) convertView.findViewById(R.id.routeCountText);

            convertView.setTag(holder);
        } else {
            holder = (ViewHolder) convertView.getTag();
        }

        Runner runner = mRunners.get(position);
        List<Route> routes = runner.getRoutes();

        holder.userImage.setImageResource(runner.getImageId());
        holder.userNameText.setText(runner.getName());
        holder.locationText.setText(runner.getLocation());
        holder.routeCountText.setText(routes.size() + "");

        return convertView;
    }

    private static class ViewHolder {
        ImageView userImage;
        TextView userNameText;
        TextView locationText;
        TextView routeCountText;
    }
}