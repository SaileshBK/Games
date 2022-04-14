package com.example.androidproject1;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;



import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText user_name,user_password;
    Button clk,clk2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        user_name = (EditText) findViewById(R.id.username);
        user_password = (EditText) findViewById(R.id.password);
        clk = (Button) findViewById(R.id.button);
        clk2 = (Button)findViewById(R.id.register_button);


    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.first_menu,menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        switch (item.getItemId()) {
            case R.id.item1:
                Toast.makeText(this, R.string.GuestLoginToast1,Toast.LENGTH_SHORT).show();
                return true;

            case R.id.item2:
                Toast.makeText(this, R.string.GuestLoginToast2,Toast.LENGTH_SHORT).show();
                return true;
        }
        return super.onOptionsItemSelected(item);
    }

    public void second_page(View v)
    {
        String st_name = user_name.getText().toString();
        String st_password = user_password.getText().toString();

        if(st_name.equals(getString(R.string.AdminUser)) && st_password.equals(getString(R.string.AdminPass)))
        {
            Intent access = new Intent(MainActivity.this, welcome.class);
            Bundle bundle = new Bundle();
            bundle.putString("name_key",st_name);
            access.putExtras(bundle);

            startActivity(access);
        }
        else if(st_name.equals("") || st_password.equals(""))
        {
            Toast.makeText(getBaseContext(), R.string.NoInputMsg,Toast.LENGTH_SHORT).show();
        }
        else
        {
            Toast.makeText(getBaseContext(), R.string.WrongInputMsg,Toast.LENGTH_SHORT).show();
        }

    }
    public void register_page(View v)
    {
        Intent access1 = new Intent(MainActivity.this, signup.class);
        startActivity(access1);

    }
}
