package com.example.androidproject1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class Game_Activity extends AppCompatActivity {
    private TextView myTitle, myDescription, myCategory;
    private ImageView my_img;
    private Button download;
    Button trailer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_game_);

        myTitle = (TextView) findViewById(R.id.game_title_id);
        myDescription = (TextView) findViewById(R.id.game_dis_id);
        myCategory = (TextView) findViewById(R.id.game_cat_id);
        my_img = (ImageView) findViewById(R.id.game_thumbnail);
        trailer = (Button) findViewById(R.id.trailer);


        download = (Button) findViewById(R.id.download_button);
        download.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                openDialog();
            }


        });


        Intent intent = getIntent();
        String Title = intent.getExtras().getString(getString(R.string.Title)); //Title is our key
        String Description = intent.getExtras().getString(getString(R.string.Description));
        String Category = intent.getExtras().getString(getString(R.string.Category));
        int image = intent.getExtras().getInt(getString(R.string.Thumbnail));


        myTitle.setText(Title);
        myDescription.setText(Description);
        myCategory.setText(Category);
        my_img.setImageResource(image);


    }

    public void openDialog() {
        Dialoggingv1 newDialog = new Dialoggingv1();
        newDialog.show(getSupportFragmentManager(), getString(R.string.DialogTag));

    }

    public void trailer(View v) {
        Intent intent = getIntent();
        String Title = intent.getExtras().getString(getString(R.string.Title));
        if (Title.equals(getString(R.string.Game1))) {

            Intent access1 = new Intent(Game_Activity.this, Youtube.class);
            final Intent intent1 = access1.putExtra(getString(R.string.trailer),getString(R.string.Game1Trailer));


            startActivity(access1);

        } else if (Title.equals(getString(R.string.Game2))) {
            Intent access1 = new Intent(Game_Activity.this, Youtube.class);

            final Intent intent1 = access1.putExtra(getString(R.string.trailer), getString(R.string.Game2Trailer));


            startActivity(access1);


        }
        else if (Title.equals(getString(R.string.Game3))) {
            Intent access1 = new Intent(Game_Activity.this, Youtube.class);

            final Intent intent1 = access1.putExtra(getString(R.string.trailer), getString(R.string.Game3Trailer));


            startActivity(access1);


        }
        else if (Title.equals(getString(R.string.Game4))) {
            Intent access1 = new Intent(Game_Activity.this, Youtube.class);

            final Intent intent1 = access1.putExtra(getString(R.string.trailer), getString(R.string.Game4Trailer));


            startActivity(access1);


        }
        else if (Title.equals(getString(R.string.Game5))) {
            Intent access1 = new Intent(Game_Activity.this, Youtube.class);

            final Intent intent1 = access1.putExtra(getString(R.string.trailer), getString(R.string.Game5Trailer));


            startActivity(access1);


        }
        else if (Title.equals(getString(R.string.Game6))) {
            Intent access1 = new Intent(Game_Activity.this, Youtube.class);

            final Intent intent1 = access1.putExtra(getString(R.string.trailer), getString(R.string.Game6Trailer));


            startActivity(access1);


        }

        else if (Title.equals(getString(R.string.Game7))) {
            Intent access1 = new Intent(Game_Activity.this, Youtube.class);

            final Intent intent1 = access1.putExtra(getString(R.string.trailer), getString(R.string.Game7Trailer));


            startActivity(access1);


        }
        else if (Title.equals(getString(R.string.Game8))) {
            Intent access1 = new Intent(Game_Activity.this, Youtube.class);

            final Intent intent1 = access1.putExtra(getString(R.string.trailer), getString(R.string.Game8Trailer));


            startActivity(access1);


        }
        else if (Title.equals(getString(R.string.Game9))) {
            Intent access1 = new Intent(Game_Activity.this, Youtube.class);

            final Intent intent1 = access1.putExtra(getString(R.string.trailer), getString(R.string.Game9Trailer));


            startActivity(access1);


        }
        else if (Title.equals(getString(R.string.Game10))) {
            Intent access1 = new Intent(Game_Activity.this, Youtube.class);

            final Intent intent1 = access1.putExtra(getString(R.string.trailer), getString(R.string.Game10Trailer));


            startActivity(access1);


        }
        else if (Title.equals(getString(R.string.Game11))) {
            Intent access1 = new Intent(Game_Activity.this, Youtube.class);

            final Intent intent1 = access1.putExtra(getString(R.string.trailer), getString(R.string.Game11Trailer));


            startActivity(access1);


        }










    }
}
