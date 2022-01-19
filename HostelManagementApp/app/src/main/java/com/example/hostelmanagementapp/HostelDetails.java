package com.example.hostelmanagementapp;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class HostelDetails extends Activity {
    Button back1;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.hotel_details);
        back1 = (Button)findViewById(R.id.back);

        back1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent4 = new Intent(getApplicationContext(), StudentDashboard.class);
                startActivity(intent4);
            }
        });

    }
}
