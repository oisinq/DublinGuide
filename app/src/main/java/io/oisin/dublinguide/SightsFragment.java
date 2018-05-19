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

public class SightsFragment extends Fragment {
    ListView listView;

    public SightsFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.location_list, container, false);

        final ArrayList<Location> locations = new ArrayList<>();
        locations.add(new Location(getString(R.string.sight1name), getString(R.string.sight1address), R.drawable.guinness));
        locations.add(new Location(getString(R.string.sight2name), getString(R.string.sight2address), R.drawable.kells));
        locations.add(new Location(getString(R.string.sight3name), getString(R.string.sight3address), R.drawable.killmainham));
        locations.add(new Location(getString(R.string.sight4name), getString(R.string.sight4address), R.drawable.castle));

        LocationAdapter adapter = new LocationAdapter(getActivity(), locations, R.color.category_sights);

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
