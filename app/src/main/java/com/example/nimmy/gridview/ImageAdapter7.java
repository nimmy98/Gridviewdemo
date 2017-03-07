package com.example.nimmy.gridview;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * Created by Nimmy on 26-01-2017.
 */

 public class ImageAdapter7 extends BaseAdapter {

    private Context con;

    int setting[] = new int[]{
            R.drawable.readind_speed,
            R.drawable.alaram,
            R.drawable.call_tone,
            R.drawable.wifi,
            R.drawable.screen_timeout,
    };
    String name[] = new String[]{
            "Reading_spped",
            "Alaram",
            "Call_tone",
            "WiFi",
            "Scrren_timeout",
    };
    public ImageAdapter7(Context c) {
        con = c;
    }

    @Override
    public int getCount() {
        return setting.length;
    }

    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }
    static class ViewHolder {
        ImageView iconImage;
        TextView categoryText;
    }


    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        ImageAdapter.ViewHolder holder;
        if (convertView == null) {
            holder = new ImageAdapter.ViewHolder();
            convertView = LayoutInflater.from(con).inflate(R.layout.single_row,parent, false);
            holder.iconImage = (ImageView)convertView.findViewById(R.id.main_image);
            holder.categoryText = (TextView) convertView.findViewById(R.id.main_TV);
            convertView.setTag(holder);
        }
        else{
            holder = (ImageAdapter.ViewHolder)convertView.getTag();
        }
        holder.iconImage.setPadding(3,3,3, 3);
        holder.iconImage.setImageResource(setting[position]);
        holder.categoryText.setText(name[position]);
        return convertView;
    }
}
