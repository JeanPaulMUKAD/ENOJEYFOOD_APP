package com.example.enjoyfoof.adapters;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.enjoyfoof.R;
import com.example.enjoyfoof.activities.DetailedDailyMealActivity;
import com.example.enjoyfoof.models.DailyMealModel;

import java.util.List;

public class DailyMealAdapter extends RecyclerView.Adapter<DailyMealAdapter.viewHolder> {
    Context context;
    List<DailyMealModel> list;
    public DailyMealAdapter(Context context, List<DailyMealModel>list){
        this.context = context;
        this.list = list;
    }
    @NonNull
    @Override
    public viewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new viewHolder(LayoutInflater.from(parent.getContext()).inflate(R.layout.daily_maeal_item, parent,false));
    }

    @Override
    public void onBindViewHolder(@NonNull viewHolder holder, int position) {
            holder.imageView.setImageResource(list.get(position).getImage());
            holder.name.setText(list.get(position).getName());
            holder.discount.setText(list.get(position).getDiscount());
            holder.description.setText(list.get(position).getDescription());

            holder.imageView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent = new Intent(context, DetailedDailyMealActivity.class);
                    intent.putExtra("Type", list.get(position).getType());
                    context.startActivity(intent);
                }
            });
    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    public class viewHolder extends RecyclerView.ViewHolder {
        ImageView imageView;
        TextView name,description,discount,type;
        public viewHolder(@NonNull View itemView) {
            super(itemView);

            imageView = itemView.findViewById(R.id.imageView);
            name = itemView.findViewById(R.id.textMail01);
            discount= itemView.findViewById(R.id.discountMeal);
            description = itemView.findViewById(R.id.descriptionMeal);
        }
    }
}
