package com.example.enjoyfoof.ui.dailyMeal;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.enjoyfoof.R;
import com.example.enjoyfoof.adapters.DailyMealAdapter;
import com.example.enjoyfoof.databinding.FragmentSlideshowBinding;
import com.example.enjoyfoof.models.DailyMealModel;

import java.util.ArrayList;
import java.util.List;

public class DailyMealFragment extends Fragment {

    RecyclerView recyclerView;
    List<DailyMealModel> dailyMealModels;
    DailyMealAdapter dailyMealAdapter;
    private FragmentSlideshowBinding binding;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {

        View root = inflater.inflate(R.layout.daily_meal_fragment, container, false);
        recyclerView = root.findViewById(R.id.daily_meal_rec);
        recyclerView.setLayoutManager(new LinearLayoutManager(getContext()));
        dailyMealModels = new ArrayList<>();
        dailyMealModels.add(new DailyMealModel(R.drawable.breakfast, "BreakFast", "30% OFF", "Description", "breakfast"));
        dailyMealModels.add(new DailyMealModel(R.drawable.cofee, "Coffee", "30% OFF", "Description", "cofee"));
        dailyMealModels.add(new DailyMealModel(R.drawable.lunch, "Lunch", "20% OFF", "Description", "lunch"));
        dailyMealModels.add(new DailyMealModel(R.drawable.sweet, "Sweet", "50% OFF", "Description", "sweet"));
        dailyMealModels.add(new DailyMealModel(R.drawable.dinner, "Dinner", "25% OFF", "Description", "dinner"));

        dailyMealAdapter = new DailyMealAdapter(getContext(),dailyMealModels);
        recyclerView.setAdapter(dailyMealAdapter);
        dailyMealAdapter.notifyDataSetChanged();

        return root;
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }

}
