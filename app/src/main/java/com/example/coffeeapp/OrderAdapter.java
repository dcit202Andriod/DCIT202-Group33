package com.example.coffeeapp;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.coffeeapp.R;

import java.util.List;

public class OrderAdapter extends RecyclerView.Adapter<OrderAdapter.ViewHolder> {

    List<Model> modelList;
    Context context;

    public OrderAdapter(Context context, List<Model> modelList) {
        this.context = context;
        this.modelList = modelList;

    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int i) {
        View view = LayoutInflater.from(context).inflate(R.layout.listitem, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder( ViewHolder viewHolder, int i) {

    }

    @Override
    public int getItemCount() {
        return modelList.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder{

        TextView mDrinkName, mDrinkDescription;
        ImageView imageVIew;

        public ViewHolder(View itemView){
            super(itemView);
            mDrinkName = itemView.findViewById(R.id.coffeeName);
            mDrinkDescription = itemView.findViewById((R.id.description));
        }
    }
}
