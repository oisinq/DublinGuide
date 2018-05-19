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

public class ParksFragment extends Fragment {
    ListView listView;

    public ParksFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.location_list, container, false);

        final ArrayList<Location> locations = new ArrayList<>();
        locations.add(new Location(getString(R.string.park1name), getString(R.string.park1address), R.drawable.phoenix));
        locations.add(new Location(getString(R.string.park2name), getString(R.string.park2address), R.drawable.stephensgreen));
        locations.add(new Location(getString(R.string.park3name), getString(R.string.park3address), R.drawable.botanic));
        locations.add(new Location(getString(R.string.park4name), getString(R.string.park4address), R.drawable.iveagh));

        LocationAdapter adapter = new LocationAdapter(getActivity(), locations, R.color.category_parks);

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
