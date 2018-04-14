package com.example.cloudymous.visitgowa;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by Cloudymous on 19/01/2018.
 */

public class FoodListAdapter extends ArrayAdapter<FoodList> {

    private static final String LOG_TAG = FoodListAdapter.class.getSimpleName();

    public FoodListAdapter (Activity context, ArrayList<FoodList> foodList){
        super(context, 0, foodList);
    }

    public View getView(int position, View convertView, ViewGroup parent) {

        View listFoodView = convertView;

        if (listFoodView == null){
            listFoodView = LayoutInflater.from(getContext()).inflate(
                    R.layout.list_layout, parent, false);
        }

        FoodList currentFood = getItem(position);

        TextView outletNameTextView = (TextView) listFoodView.findViewById(R.id.outletName);
        outletNameTextView.setText(currentFood.getOutletName());

        TextView outletCaptionTextView = (TextView) listFoodView.findViewById(R.id.outletCaption);
        outletCaptionTextView.setText(currentFood.getOutletCaption());

        return listFoodView;
    }
}
