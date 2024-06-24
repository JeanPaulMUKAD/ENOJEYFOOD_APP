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
import com.example.enjoyfoof.adapters.HomeVerAdapter;
import com.example.enjoyfoof.databinding.FragmentHomeBinding;
import com.example.enjoyfoof.models.HomeHorcModel;
import com.example.enjoyfoof.models.HomeVerModel;

import java.util.ArrayList;
import java.util.List;

public class HomeFragment extends Fragment {

    RecyclerView homeHorizontalRec,homeVerticalRec;
    List<HomeHorcModel> homeHorcModelList;
    HomeHorcAdapter homeHorcAdapter;
    private FragmentHomeBinding binding;

    ////////////////////Vertical
    List<HomeVerModel> homeVerModelList;
    HomeVerAdapter homeVerAdapter;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {

        binding = FragmentHomeBinding.inflate(inflater, container, false);
        View root = binding.getRoot();

        homeHorizontalRec = root.findViewById(R.id.home_hor_rec);
        homeVerticalRec = root.findViewById(R.id.home_ver_rec);

        /////////////////Horizontal RecyclerView
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

        /////////////////Vertical RecyclerView
        homeVerModelList = new ArrayList<>();
        homeVerModelList.add(new HomeVerModel(R.drawable.pizza,"Pizza","10:00 - 21:30","4.9", "Min - $15"));
        homeVerModelList.add(new HomeVerModel(R.drawable.pizza2,"Pizza","10:00 - 21:30","4.9", "Min - $15"));
        homeVerModelList.add(new HomeVerModel(R.drawable.pizza3,"Pizza","10:00 - 21:30","4.9", "Min - $15"));

        homeVerAdapter = new HomeVerAdapter(getActivity(),homeVerModelList);
        homeVerticalRec.setAdapter(homeVerAdapter);
        homeVerticalRec.setLayoutManager(new LinearLayoutManager(getActivity(), RecyclerView.VERTICAL, false));
        homeVerticalRec.setHasFixedSize(true);
        homeVerticalRec.setNestedScrollingEnabled(false);
        return root;
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }
}