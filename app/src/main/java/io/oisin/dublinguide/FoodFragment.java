package io.oisin.dublinguide;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;

/**
 * Created by Oisin Quinn (@oisin1001) on 20/03/2018.
 */

public class FoodFragment extends Fragment {
    ListView listView;

    public FoodFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.location_list, container, false);

        final ArrayList<Location> locations = new ArrayList<>();
        locations.add(new Location(getString(R.string.food1name), getString(R.string.food1address), R.drawable.boojum));
        locations.add(new Location(getString(R.string.food2name), getString(R.string.food2address), R.drawable.bunsen));
        locations.add(new Location(getString(R.string.food3name), getString(R.string.food3address), R.drawable.zambrero));
        locations.add(new Location(getString(R.string.food4name), getString(R.string.food4address), R.drawable.nandos));

        LocationAdapter adapter = new LocationAdapter(getActivity(), locations, R.color.category_food);

        listView = (ListView) rootView.findViewById(R.id.list);

        listView.setAdapter(adapter);


        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Location l = locations.get(position);

            }
        });

        return rootView;
    }
}
