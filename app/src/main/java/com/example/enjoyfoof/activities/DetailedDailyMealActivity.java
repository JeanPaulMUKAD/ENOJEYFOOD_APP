package com.example.enjoyfoof.activities;

import android.os.Bundle;
import android.widget.ImageView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.enjoyfoof.R;
import com.example.enjoyfoof.adapters.DetailedDailyAdaptater;
import com.example.enjoyfoof.models.DatailedDailyModel;

import java.util.ArrayList;
import java.util.List;

public class DetailedDailyMealActivity extends AppCompatActivity {
    RecyclerView recyclerView;
    List<DatailedDailyModel> datailedDailyModelList;
    DetailedDailyAdaptater detailedDailyAdaptater;
    ImageView imageView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detailed_daily_meal);
        String type = getIntent().getStringExtra("type");

        recyclerView = findViewById(R.id.detailed_rec);
        imageView = findViewById(R.id.detailed_image);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        datailedDailyModelList = new ArrayList<>();
        detailedDailyAdaptater = new DetailedDailyAdaptater(datailedDailyModelList);
        recyclerView.setAdapter(detailedDailyAdaptater);
        if(type != null && type.equalsIgnoreCase("breakfast")){
            datailedDailyModelList.add(new DatailedDailyModel(R.drawable.fav1, "Breakfast", "description", "4.5", "$19", "10am to 9pm"));
            datailedDailyModelList.add(new DatailedDailyModel(R.drawable.fav2, "Breakfast", "description", "4.5", "$19", "10am to 9pm"));
            datailedDailyModelList.add(new DatailedDailyModel(R.drawable.fav3, "Breakfast", "description", "4.5", "$19", "10am to 9pm"));
            detailedDailyAdaptater.notifyDataSetChanged();
        }

        if(type != null && type.equalsIgnoreCase("sweet")){

            imageView.setImageResource(R.drawable.sweet);
            datailedDailyModelList.add(new DatailedDailyModel(R.drawable.s1, "Breakfast", "description", "4.5", "$19", "10am to 9pm"));
            datailedDailyModelList.add(new DatailedDailyModel(R.drawable.s2, "Breakfast", "description", "4.5", "$19", "10am to 9pm"));
            datailedDailyModelList.add(new DatailedDailyModel(R.drawable.s3, "Breakfast", "description", "4.5", "$19", "10am to 9pm"));
            detailedDailyAdaptater.notifyDataSetChanged();
        }

    }
}