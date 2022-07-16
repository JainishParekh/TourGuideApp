package com.example.tourguideapp;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.core.content.ContextCompat;

import java.util.ArrayList;

public class ListAdapter extends ArrayAdapter {

    private int color;

    /**
     *
     * @param context - context of the associated activity
     * @param list - array list
     * @param color - color
     */
    public ListAdapter(Activity context , ArrayList<List> list , int color){
        super(context , 0 , list);
        this.color = color;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        View listItemView = convertView;
        if(listItemView == null)
        {
            listItemView = LayoutInflater.from(getContext()).inflate(R.layout.list_layout, parent, false);
        }

        List item = (List) getItem(position);

        View linearData = listItemView.findViewById(R.id.data_view);
        int colorId = ContextCompat.getColor(getContext() , color);
        linearData.setBackgroundColor(colorId);

        TextView nameText = (TextView) listItemView.findViewById(R.id.name);
        nameText.setText(item.getName());

        TextView addText = (TextView) listItemView.findViewById(R.id.address);
        addText.setText(item.getAddress());

        if(item.hasImage()){
            ImageView pic = (ImageView) listItemView.findViewById(R.id.imageView);
            pic.setVisibility(View.VISIBLE);

            pic.setImageResource(item.getImgId());
        }
        else
        {
            ImageView pic = (ImageView) listItemView.findViewById(R.id.imageView);
            pic.setVisibility(View.GONE);
        }

        return listItemView;
    }
}
