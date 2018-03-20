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
        locations.add(new Location("Phoenix Park", "Phoenix Park, Dublin 8", R.drawable.normie_central));
        locations.add(new Location("St Stephen's Green", "St Stephen's Green, Dublin 2", R.drawable.normie_central));
        locations.add(new Location("Botanic Gardens", "Glasnevin, Dublin 9", R.drawable.normie_central));
        locations.add(new Location("Iveagh Gardens", "Clonmel St, Saint Kevin's, Dublin 2", R.drawable.normie_central));

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
