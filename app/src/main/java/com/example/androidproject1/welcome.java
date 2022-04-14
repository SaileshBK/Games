package com.example.androidproject1;
import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class welcome extends AppCompatActivity {

    List<Game> list_of_games;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        TextView welcome_msg = (TextView) findViewById(R.id.marquee_text);
        welcome_msg.setSelected(true);


        list_of_games = new ArrayList<>();
        list_of_games.add(new Game(getString(R.string.Game1),getString(R.string.Category1),getString(R.string.Game1Description),R.drawable.gtav));
        list_of_games.add(new Game(getString(R.string.Game2),getString(R.string.Category1),getString(R.string.Game2Description),R.drawable.the_witcher));
        list_of_games.add(new Game(getString(R.string.Game3),getString(R.string.Category1),getString(R.string.Game3Description),R.drawable.minecraft));
        list_of_games.add(new Game(getString(R.string.Game4),getString(R.string.Category1),getString(R.string.Game4Description),R.drawable.reddead));
        list_of_games.add(new Game(getString(R.string.Game5),getString(R.string.Category1),getString(R.string.Game5Description),R.drawable.fallout4));
        list_of_games.add(new Game(getString(R.string.Game6),getString(R.string.Category1),getString(R.string.Game6Description),R.drawable.zelda));
        list_of_games.add(new Game(getString(R.string.Game7),getString(R.string.Category1),getString(R.string.Game7Description),R.drawable.pthantompain));
        list_of_games.add(new Game(getString(R.string.Game8),getString(R.string.Category1),getString(R.string.Game8Description),R.drawable.nomanssky));
        list_of_games.add(new Game(getString(R.string.Game9),getString(R.string.Category1),getString(R.string.Game9Description),R.drawable.assassincreed));
        list_of_games.add(new Game(getString(R.string.Game10),getString(R.string.Category1),getString(R.string.Game10Description),R.drawable.horizon));
        list_of_games.add(new Game(getString(R.string.Game11),getString(R.string.Category1),getString(R.string.Game11Description),R.drawable.madmax));


        RecyclerView my_recyclerview = (RecyclerView) findViewById(R.id.my_recyclerview_id);
        Recycler_adapter myadapter = new Recycler_adapter(this,list_of_games);
        my_recyclerview.setLayoutManager(new GridLayoutManager(this,4));
        my_recyclerview.setAdapter(myadapter);


    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.second_menu,menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        switch (item.getItemId()) {

            case R.id.item3:
                Toast.makeText(this, R.string.Menu2Text1,Toast.LENGTH_SHORT).show();
                return true;
            case R.id.item4:
                Toast.makeText(this, R.string.Menu2Text2,Toast.LENGTH_SHORT).show();
                return true;
            case R.id.item5:
                Toast.makeText(this, R.string.Menu2Text3,Toast.LENGTH_SHORT).show();
                return true;
            case R.id.item6:
                Toast.makeText(this, R.string.Menu2Text4,Toast.LENGTH_SHORT).show();
                return true;
            case R.id.item7:
                Toast.makeText(this, R.string.Menu2Text5,Toast.LENGTH_SHORT).show();
                return true;
            case R.id.item8:
                Toast.makeText(this, R.string.Menu2Text6,Toast.LENGTH_SHORT).show();
                return true;
        }
        return super.onOptionsItemSelected(item);
    }
}
