package com.example.enjoyfoof.adapters;

import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class HomeHorAdapter extends RecyclerView.Adapter<HomeHorAdapter.ViweHolder> {

    @NonNull
    @Override
    public ViweHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return null;
    }

    @Override
    public void onBindViewHolder(@NonNull ViweHolder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return 0;
    }

    public class ViweHolder extends RecyclerView.ViewHolder {

        public ViweHolder(@NonNull View itemView) {
            super(itemView);
        }
    }
}
