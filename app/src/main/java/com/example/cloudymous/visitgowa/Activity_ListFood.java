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

        ArrayList<ItemList> foodList = new ArrayList<>();
        foodList.add(new ItemList("Nasi Kuning Daeng Sewang", "Kuliner tengah malam"));
        foodList.add(new ItemList("Ayam Bakar Mas Ahmad", "Ayam Bakar enak"));
        foodList.add(new ItemList("Coto Daeng Liwang", "Coto murah meriah"));
        foodList.add(new ItemList("Coto Sampeang", "Alternatif coto murah meriah"));
        foodList.add(new ItemList("Sari Laut Andalan", "Sari laut andalan bosku"));
        foodList.add(new ItemList("Bakso Kuah Salis", "Bakso andalan anak Salis"));
        foodList.add(new ItemList("Pizza Hut Delivery", "Yang baru saja hits di Gowa"));


        ItemListAdapter foodItems = new ItemListAdapter(this, foodList );
        ListView listView = (ListView) findViewById(R.id.foodList);
        listView.setAdapter(foodItems);

    }
}
