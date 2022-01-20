package com.example.loginplatform;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    Button btnWelcome;
    Intent intentWelcome;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        btnWelcome= (Button) findViewById(R.id.nextScreen);

 btnWelcome.setOnClickListener(new View.OnClickListener() {
     @Override
     public void onClick(View v) {
         intentWelcome = new Intent(getApplicationContext(), ProfileActivity.class);
         startActivity(intentWelcome);
     }

 });

    }

}