package io.oisin.dublinguide;

import android.app.Activity;
import android.support.v4.content.ContextCompat;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class LocationAdapter extends ArrayAdapter<Location> {


    private int colorResourceId;

    public LocationAdapter(Activity context, ArrayList<Location> locations, int color) {
        super(context, 0, locations);
        this.colorResourceId = color;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        // Check if the existing view is being reused, otherwise inflate the view
        View listItemView = convertView;
        if(listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.list_item, parent, false);
        }

        // Get the Word object located at this position in the list
        Location currentLocation = getItem(position);

        // Find the TextView in the list_item.xml layout with the ID miwok_text_view
        TextView nameTextView = (TextView) listItemView.findViewById(R.id.name_text_view);
        // Get the version name from the current Word object and
        // set this text on the name TextView
        nameTextView.setText(currentLocation.getName());

        // Find the TextView in the list_item.xml layout with the ID default_text_view
        TextView addressTextView = (TextView) listItemView.findViewById(R.id.address_text_view);
        // Get the version number from the current Word object and
        // set this text on the number TextView
        addressTextView.setText(currentLocation.getAddress());

        ImageView icon = (ImageView) listItemView.findViewById(R.id.icon);

        icon.setImageResource(currentLocation.getImageID());
        icon.setVisibility(View.VISIBLE);


        View textContainer = listItemView.findViewById(R.id.container);
        int color = ContextCompat.getColor(getContext(), colorResourceId);
        textContainer.setBackgroundColor(color);

        // Return the whole list item layout (containing 2 TextViews and an ImageView)
        // so that it can be shown in the ListView
        return listItemView;
    }
}
