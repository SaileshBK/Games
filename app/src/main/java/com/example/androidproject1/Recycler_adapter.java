package com.example.androidproject1;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class Recycler_adapter extends RecyclerView.Adapter<Recycler_adapter.view_holder> {



    private Context my_context,my_context2;
    private List<Game> my_data;

    public Recycler_adapter(Context my_context, List<Game> my_data) {
        this.my_context = my_context;
        this.my_data = my_data;
    }

    @NonNull
    @Override
    public view_holder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View view;
        LayoutInflater my_inflater = LayoutInflater.from(my_context);
        view = my_inflater.inflate(R.layout.my_card_view,parent,false);

        return new view_holder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull view_holder holder, @SuppressLint("RecyclerView") final int position) {

        holder.game_title.setText(my_data.get(position).getTitle());
        holder.game_thumbnail.setImageResource(my_data.get(position).getThumbnail());
        holder.cardView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(my_context,Game_Activity.class);
                intent.putExtra("Title",my_data.get(position).getTitle());
                intent.putExtra("Description",my_data.get(position).getDescription());
                intent.putExtra("Category",my_data.get(position).getCategory());
                intent.putExtra("Thumbnail",my_data.get(position).getThumbnail());
                my_context.startActivity(intent);









            }
        });




    }

    @Override
    public int getItemCount() {
        return my_data.size();
    }

    public static class view_holder extends RecyclerView.ViewHolder {

        CardView cardView;
        TextView game_title;
        ImageView game_thumbnail;



        public view_holder(@NonNull View itemView) {
            super(itemView);
            game_title = (TextView) itemView.findViewById(R.id.title_id);
            game_thumbnail = (ImageView) itemView.findViewById(R.id.image_id);
            cardView = (CardView) itemView.findViewById(R.id.cardView);
        }
    }





}
