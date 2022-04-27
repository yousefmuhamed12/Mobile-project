package com.example.menu;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class MyAdapter extends RecyclerView.Adapter<MyAdapter.MyViewHolder> {
    String[] data1, data2;
    int[] images;
    Context context;
    public MyAdapter(Context ct, String[] s1, String[] s2, int[] img){
        context= ct;
        data1=s1;
        data2=s2;
        images=img;

    }
    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater=LayoutInflater.from(context);
       View view= inflater.inflate(R.layout.my_row,parent, false);
        return new MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {
    holder.title.setText(data1[position]);
    holder.desc.setText(data2[position]);
    holder.myImages.setImageResource(images[position]);
    }

    @Override
    public int getItemCount() {
        return images.length;
    }

    public static class MyViewHolder extends RecyclerView.ViewHolder{
        TextView title;
        TextView desc;
        ImageView myImages;
        public MyViewHolder(@NonNull View itemView) {
            super(itemView);
            title= itemView.findViewById(R.id.pizzas_txt);
            desc= itemView.findViewById(R.id.description_txt);
            myImages=itemView.findViewById(R.id.myImageView);
        }
    }
}
