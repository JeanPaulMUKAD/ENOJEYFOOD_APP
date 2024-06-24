package com.example.enjoyfoof.ui.home;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.enjoyfoof.R;
import com.example.enjoyfoof.adapters.HomeHorcAdapter;
import com.example.enjoyfoof.databinding.FragmentHomeBinding;
import com.example.enjoyfoof.models.HomeHorcModel;

import java.util.ArrayList;
import java.util.List;

public class HomeFragment extends Fragment {

    RecyclerView homeHorizontalRec;
    List<HomeHorcModel> homeHorcModelList;
    HomeHorcAdapter homeHorcAdapter;
    private FragmentHomeBinding binding;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {

        binding = FragmentHomeBinding.inflate(inflater, container, false);
        View root = binding.getRoot();

        homeHorizontalRec = root.findViewById(R.id.home_hor_rec);
        homeHorcModelList = new ArrayList<>();
        homeHorcModelList.add(new HomeHorcModel(R.drawable.pizza, "Pizza"));
        homeHorcModelList.add(new HomeHorcModel(R.drawable.humberger, "Humberger"));
        homeHorcModelList.add(new HomeHorcModel(R.drawable.fries, "Fries"));
        homeHorcModelList.add(new HomeHorcModel(R.drawable.cream, "Ice Cream"));
        homeHorcModelList.add(new HomeHorcModel(R.drawable.sandwich, "Sandwich"));

        homeHorcAdapter = new HomeHorcAdapter(getActivity(),homeHorcModelList);
        homeHorizontalRec.setAdapter(homeHorcAdapter);
        homeHorizontalRec.setLayoutManager(new LinearLayoutManager(getActivity(), RecyclerView.HORIZONTAL, false));
        homeHorizontalRec.setHasFixedSize(true);
        homeHorizontalRec.setNestedScrollingEnabled(false);
        return root;
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }
}