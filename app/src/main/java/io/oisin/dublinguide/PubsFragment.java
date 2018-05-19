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

public class PubsFragment extends Fragment {
    ListView listView;

    public PubsFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.location_list, container, false);

        final ArrayList<Location> locations = new ArrayList<>();
        locations.add(new Location(getString(R.string.pub1name), getString(R.string.pub1address), R.drawable.doyles));
        locations.add(new Location(getString(R.string.pub2name), getString(R.string.pub2address), R.drawable.cassidy));
        locations.add(new Location(getString(R.string.pub3name), getString(R.string.pub3address), R.drawable.threetuntavern));
        locations.add(new Location(getString(R.string.pub4name), getString(R.string.pub4address), R.drawable.fortyfoot));

        LocationAdapter adapter = new LocationAdapter(getActivity(), locations, R.color.category_pubs);

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
