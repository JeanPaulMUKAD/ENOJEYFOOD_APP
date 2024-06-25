package com.example.enjoyfoof.adapters;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.enjoyfoof.R;
import com.example.enjoyfoof.models.DatailedDailyModel;

import java.util.List;

public class DetailedDailyAdaptater extends RecyclerView.Adapter<DetailedDailyAdaptater.viewHolder> {
    List<DatailedDailyModel>list;
    public DetailedDailyAdaptater(List<DatailedDailyModel> list){
        this.list = list;
    }

    @NonNull
    @Override
    public viewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new viewHolder(LayoutInflater.from(parent.getContext()).inflate(R.layout.detailed_daily_meal_item,parent,false));
    }

    @Override
    public void onBindViewHolder(@NonNull viewHolder holder, int position) {
        holder.imageView.setImageResource(list.get(position).getImage());
        holder.name.setText(list.get(position).getName());
        holder.description.setText(list.get(position).getDescription());
        holder.rating.setText(list.get(position).getRacing());
        holder.timing.setText(list.get(position).getTiming());
    }


    @Override
    public int getItemCount() {
        return list.size();
    }

    public class viewHolder extends RecyclerView.ViewHolder {
            ImageView imageView;
            TextView name, price, description,rating,timing;
        public viewHolder(@NonNull View itemView) {
            super(itemView);
            imageView = itemView.findViewById(R.id.detailed_image);
            name = itemView.findViewById(R.id.detailed_name);
            description= itemView.findViewById(R.id.detailed_description);
            rating = itemView.findViewById(R.id.detailed_rading);
            timing = itemView.findViewById(R.id.detailed_timing);
        }
    }
}
