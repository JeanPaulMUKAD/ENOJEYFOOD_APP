package com.example.enjoyfoof.ui.home;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.enjoyfoof.R;
import com.example.enjoyfoof.adapters.HomeHorAdapter;
import com.example.enjoyfoof.adapters.HomeVerAdapter;
import com.example.enjoyfoof.models.HomeHorModel;
import com.example.enjoyfoof.models.HomeVerModel;

import java.util.ArrayList;
import java.util.List;

public class HomeFragment extends Fragment {

    RecyclerView homeHorizontalRec, homeVerticalRec;
    List<HomeHorModel> homeHorModelList;
    HomeHorAdapter homeHorAdapter;

    ////////////Vertical
    List<HomeVerModel> homeVerModelList;
    HomeVerAdapter homeVerAdapter;

    public View onCreatView(@NonNull LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState){
        View root = inflater.inflate(R.layout.fragment_home, container, false);
        homeHorizontalRec = root.findViewById(R.id.home_hor_rec);
        homeVerticalRec = root.findViewById(R.id.home_ver_rec);


        ////////HorizontalRecyclerView

        homeHorModelList = new ArrayList<>();
        homeHorModelList.add(new HomeHorModel(R.drawable.pizza,"Pizza"));
        homeHorModelList.add(new HomeHorModel(R.drawable.humberger,"Berger"));
        homeHorModelList.add(new HomeHorModel(R.drawable.cream3,"Ice Cream"));
        homeHorModelList.add(new HomeHorModel(R.drawable.fries,"Fries"));
        homeHorModelList.add(new HomeHorModel(R.drawable.sandwich4,"Sandwich"));

        homeHorAdapter = new HomeHorAdapter(getActivity(), homeHorModelList);
        homeHorizontalRec.setAdapter(homeHorAdapter);
        homeHorizontalRec.setLayoutManager(new LinearLayoutManager(getActivity(), RecyclerView.HORIZONTAL, false));
        homeHorizontalRec.setHasFixedSize(true);
        homeHorizontalRec.setNestedScrollingEnabled(false);

        ////////VerticalRecyclerView
        homeHorModelList = new ArrayList<>();
        homeVerModelList.add(new HomeVerModel(R.drawable.pizza,"Pizza 1", "10:00 - 20:30","4.9", "$15"));
        homeVerModelList.add(new HomeVerModel(R.drawable.pizza1,"Pizza 2", "10:00 - 20:30","4.9", "$15"));
        homeVerModelList.add(new HomeVerModel(R.drawable.pizza2,"Pizza 3 ", "10:00 - 20:30","4.9", "$15"));
        homeVerModelList.add(new HomeVerModel(R.drawable.pizza3,"Pizza 4", "10:00 - 20:30","4.9", "$15"));

        homeVerAdapter = new HomeVerAdapter(getActivity(), homeVerModelList);
        homeVerticalRec.setAdapter(homeVerAdapter);
        homeVerticalRec.setLayoutManager(new LinearLayoutManager(getActivity(), RecyclerView.VERTICAL, false));
        homeVerticalRec.setHasFixedSize(true);
        homeVerticalRec.setNestedScrollingEnabled(false);
        return  root;
    }

}
