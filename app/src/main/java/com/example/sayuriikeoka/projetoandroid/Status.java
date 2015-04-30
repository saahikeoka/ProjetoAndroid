package com.example.sayuriikeoka.projetoandroid;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.List;

/**
 * Created by Sayuri Ikeoka on 30/04/2015.
 */
/*public class Status extends ArrayAdapter {
    protected Context mContext;
    protected List mStatus;

    public Status(Context context, List status) {
        super(context, R.layout.homepage, status);
        mContext = context;
        mStatus = status;
    }

    @Override
    public View getView(final int position, View convertView, ViewGroup parent) {
        ViewHolder holder;

        if (convertView == null) {
            convertView = LayoutInflater.from(mContext).inflate(
                    R.layout.homepage, null);
            holder = new ViewHolder();
            holder.usernameHomepage = (TextView) convertView
                    .findViewById(R.id.textview);

            convertView.setTag(holder);
        } else {

            holder = (ViewHolder) convertView.getTag();

        }

        ParseObject statusObject = mStatus.get(position);

        // title
        String username = statusObject.getString("user");
        holder.usernameHomepage.setText(username);

        // content
        String status = statusObject.getString("newStatus");
        holder.statusHomepage.setText(status);

        return convertView;
    }

    public static class ViewHolder {
        TextView usernameHomepage;
        TextView statusHomepage;

    }

}*/