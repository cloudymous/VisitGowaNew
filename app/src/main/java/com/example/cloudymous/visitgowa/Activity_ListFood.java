package com.example.cloudymous.visitgowa;

import android.app.Activity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class Activity_ListFood extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.home_food_list_layout);

        ArrayList<FoodList> foodList = new ArrayList<>();
        foodList.add(new FoodList("Nasi Kuning Daeng Sewang", "Kuliner tengah malam"));
        foodList.add(new FoodList("Ayam Bakar Mas Ahmad", "Ayam Bakar enak"));
        foodList.add(new FoodList("Coto Daeng Liwang", "Coto murah meriah"));
        foodList.add(new FoodList("Coto Sampeang", "Alternatif coto murah meriah"));
        foodList.add(new FoodList("Sari Laut Andalan", "Sari laut andalan bosku"));
        foodList.add(new FoodList("Bakso Kuah Salis", "Bakso andalan anak Salis"));
        foodList.add(new FoodList("Pizza Hut Delivery", "Yang baru saja hits di Gowa"));


        FoodListAdapter foodItems = new FoodListAdapter(this, foodList );
        ListView listView = (ListView) findViewById(R.id.foodList);
        listView.setAdapter(foodItems);

    }
}
