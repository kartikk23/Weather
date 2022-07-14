package com.kartik.weather;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class covidAdapter extends RecyclerView.Adapter<covidAdapter.ViewHolder> {
    private  final Context context;
    private final ArrayList<model> arrayList;

    public covidAdapter(Context context, ArrayList<model> arrayList) {
        this.context = context;
        this.arrayList = arrayList;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.datalayout, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        holder.userId.setText(arrayList.get(position).getUserId());
        holder.id.setText(arrayList.get(position).getId());
        holder.title.setText(arrayList.get(position).getTitle());
        holder.completed.setText(arrayList.get(position).getCompleted());

    }

    @Override
    public int getItemCount() {
        return arrayList.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {

        TextView userId,id,title,completed;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            userId = itemView.findViewById(R.id.userId);
            id = itemView.findViewById(R.id.id);
            title = itemView.findViewById(R.id.title);
            completed = itemView.findViewById(R.id.completed);
        }
    }
}
