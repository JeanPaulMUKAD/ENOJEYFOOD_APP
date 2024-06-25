package com.example.enjoyfoof.ui.dailyMeal;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
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
        dailyMealModels = new ArrayList<>();
        dailyMealModels.add(new DailyMealModel(R.drawable.breakfast, "BreakFast", "30% OFF", "Description"));
        dailyMealModels.add(new DailyMealModel(R.drawable.cofee, "Coffee", "30% OFF", "Description"));
        dailyMealModels.add(new DailyMealModel(R.drawable.lunch, "Lunch", "30% OFF", "Description"));
        dailyMealModels.add(new DailyMealModel(R.drawable.sweet, "Sweet", "30% OFF", "Description"));
        dailyMealModels.add(new DailyMealModel(R.drawable.dinner, "Dinner", "30% OFF", "Description"));

        return root;
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }

}
