package com.example.enjoyfoof.adapters;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.enjoyfoof.R;
import com.example.enjoyfoof.models.HomeHorModel;

import java.util.List;

public class HomeHorAdapter extends RecyclerView.Adapter<HomeHorAdapter.ViweHolder> {

    Context context;
    List<HomeHorModel> list;

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
        ImageView imageView;
        TextView name;
        public ViweHolder(@NonNull View itemView) {
            super(itemView);

            imageView = itemView.findViewById(R.id.hor_image);
            name = itemView.findViewById(R.id.hor_text);
        }
    }
}
