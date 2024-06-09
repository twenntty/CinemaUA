package com.markus.cinemaua;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;
import android.view.View;
import android.content.Context;

import java.util.ArrayList;

public class ShowtimesAdapter extends ArrayAdapter<String> {
    public ShowtimesAdapter(Context context, ArrayList<String> showtimes) {
        super(context, 0, showtimes);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        if (convertView == null) {
            convertView = LayoutInflater.from(getContext()).inflate(R.layout.item_showtime, parent, false);
        }

        String showtime = getItem(position);
        TextView showtimeTextView = convertView.findViewById(R.id.showtimeTextView);
        showtimeTextView.setText(showtime);

        return convertView;
    }
}
