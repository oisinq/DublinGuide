/*
 * Copyright (C) 2016 The Android Open Source Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package io.oisin.dublinguide;

import android.content.Context;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

/**
 * Provides the appropriate {@link Fragment} for a view pager.
 */
public class CategoryAdapter extends FragmentPagerAdapter {
    private Context context;

    public CategoryAdapter(Context context, FragmentManager fm) {
        super(fm);
        this.context = context;
    }

    @Override
    public Fragment getItem(int position) {
        if (position == 0) {
            return new FoodFragment();
        } else if (position == 1){
            return new PubsFragment();
        } else if (position == 2){
            return new ParksFragment();
        } else {
            return new SightsFragment();
        }
    }

    @Override
    public CharSequence getPageTitle(int position) {
        if (position == 0) {
            return context.getString(R.string.fragment_food);
        } else if (position == 1){
            return context.getString(R.string.fragment_pubs);
        } else if (position == 2){
            return context.getString(R.string.fragment_parks);
        } else {
            return context.getString(R.string.fragment_sights);
        }
    }

    @Override
    public int getCount() {
        return 4;
    }
}