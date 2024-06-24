package com.example.enjoyfoof.adapters;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;

import com.example.enjoyfoof.R;
import com.example.enjoyfoof.models.HomeHorcModel;
import com.example.enjoyfoof.models.HomeVerModel;

import java.util.ArrayList;
import java.util.List;

public class HomeHorcAdapter extends RecyclerView.Adapter<HomeHorcAdapter.viewHolder> {
    private final ArrayList<HomeHorcModel> list;
    UpdateVerticalRec updateVerticalRec;
    Activity activity;

    boolean check = true;
    boolean select = true;
    int row_index = -1;
    public HomeHorcAdapter(UpdateVerticalRec updateVerticalRec, Activity activity, ArrayList<HomeHorcModel> list){
        this.updateVerticalRec = updateVerticalRec;
        this.activity = activity;
        this.list = list;
    }
    @NonNull
    @Override
    public viewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new viewHolder(LayoutInflater.from(parent.getContext()).inflate(R.layout.home_horizontal_item, parent, false));
    }

    @Override
    public void onBindViewHolder(@NonNull viewHolder holder, int position) {
        holder.imageView.setImageResource(list.get(position).getImage());
        holder.name.setText(list.get(position).getName());

        if (check){
            ArrayList<HomeVerModel> homeVerModels = new ArrayList<>();
            homeVerModels.add(new HomeVerModel(R.drawable.pizza, "Pizza 1", "10:00 - 21:30", "4.9", "$15"));
            homeVerModels.add(new HomeVerModel(R.drawable.pizza2, "Pizza 2", "10:00 - 21:30", "4.9", "$15"));
            homeVerModels.add(new HomeVerModel(R.drawable.pizza3, "Pizza 3", "10:00 - 21:30", "4.9", "$15"));
            homeVerModels.add(new HomeVerModel(R.drawable.pizza4, "Pizza 4", "10:00 - 21:30", "4.9", "$15"));

            updateVerticalRec.callBack(position, homeVerModels);
            check = false;
            holder.cardView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    row_index = position;
                    notifyDataSetChanged();

                    if (position == 0){

                        ArrayList<HomeVerModel> homeVerModels = new ArrayList<>();

                        homeVerModels.add(new HomeVerModel(R.drawable.pizza, "Pizza 1", "10:00 - 21:30", "4.9", "$15"));
                        homeVerModels.add(new HomeVerModel(R.drawable.pizza2, "Pizza 2", "10:00 - 21:30", "4.9", "$15"));
                        homeVerModels.add(new HomeVerModel(R.drawable.pizza3, "Pizza 3", "10:00 - 21:30", "4.9", "$15"));
                        homeVerModels.add(new HomeVerModel(R.drawable.pizza4, "Pizza 4", "10:00 - 21:30", "4.9", "$15"));

                        updateVerticalRec.callBack(position,homeVerModels);
                    }
                    else if(position == 1){
                        ArrayList<HomeVerModel> homeVerModels = new ArrayList<>();

                        homeVerModels.add(new HomeVerModel(R.drawable.humberger, "Berger 1", "10:00 - 21:30", "4.9", "$15"));
                        homeVerModels.add(new HomeVerModel(R.drawable.humberger2, "Berger 2", "10:00 - 21:30", "4.9", "$15"));
                        homeVerModels.add(new HomeVerModel(R.drawable.humberger3, "Berger 3", "10:00 - 21:30", "4.9", "$15"));
                        homeVerModels.add(new HomeVerModel(R.drawable.humberger4, "Berger 4", "10:00 - 21:30", "4.9", "$15"));

                        updateVerticalRec.callBack(position,homeVerModels);
                    }

                    else if(position == 2){
                        ArrayList<HomeVerModel> homeVerModels = new ArrayList<>();

                        homeVerModels.add(new HomeVerModel(R.drawable.fries, "Fries 1", "10:00 - 21:30", "4.9", "$15"));
                        homeVerModels.add(new HomeVerModel(R.drawable.fries1, "Fries 2", "10:00 - 21:30", "4.9", "$15"));
                        homeVerModels.add(new HomeVerModel(R.drawable.fries2, "Fries 3", "10:00 - 21:30", "4.9", "$15"));
                        homeVerModels.add(new HomeVerModel(R.drawable.fries4, "Fries 4", "10:00 - 21:30", "4.9", "$15"));

                        updateVerticalRec.callBack(position,homeVerModels);
                    }

                    else if(position == 3){
                        ArrayList<HomeVerModel> homeVerModels = new ArrayList<>();

                        homeVerModels.add(new HomeVerModel(R.drawable.cream, "Ice Cream 1", "10:00 - 21:30", "4.9", "$15"));
                        homeVerModels.add(new HomeVerModel(R.drawable.cream1, "Ice Cream 2", "10:00 - 21:30", "4.9", "$15"));
                        homeVerModels.add(new HomeVerModel(R.drawable.cream2, "Ice Cream 3", "10:00 - 21:30", "4.9", "$15"));
                        homeVerModels.add(new HomeVerModel(R.drawable.cream3, "Ice Ream 4", "10:00 - 21:30", "4.9", "$15"));

                        updateVerticalRec.callBack(position,homeVerModels);
                    }

                    else if(position == 4){
                        ArrayList<HomeVerModel> homeVerModels = new ArrayList<>();

                        homeVerModels.add(new HomeVerModel(R.drawable.sandwich1, "Sandwich 1", "10:00 - 21:30", "4.9", "$15"));
                        homeVerModels.add(new HomeVerModel(R.drawable.sandwich2, "Sandwich2", "10:00 - 21:30", "4.9", "$15"));
                        homeVerModels.add(new HomeVerModel(R.drawable.sandwich3, "Sandwich 3", "10:00 - 21:30", "4.9", "$15"));
                        homeVerModels.add(new HomeVerModel(R.drawable.sandwich4, "Sandwich4", "10:00 - 21:30", "4.9", "$15"));

                        updateVerticalRec.callBack(position,homeVerModels);
                    }
                }
            });

            if(select){
                if(position == 0){
                    holder.cardView.setBackgroundResource(R.drawable.change_bg);
                }
            }
            else {
                if(row_index == position){
                    holder.cardView.setBackgroundResource(R.drawable.change_bg);
                }else{
                    holder.cardView.setBackgroundResource(R.drawable.change_bg);
                }
            }
        }
    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    public class viewHolder extends RecyclerView.ViewHolder {

        ImageView imageView;
        TextView name;
        CardView cardView;
        public viewHolder(@NonNull View itemView) {
            super(itemView);

            imageView = itemView.findViewById(R.id.hor_image);
            name = itemView.findViewById(R.id.hor_text);
            cardView = itemView.findViewById(R.id.CardView);
        }
    }
}
