package com.example.hostelmanagementapp;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class ProfileActivity extends Activity {
    Button btnAdmin;
    Button btnStudent;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.hotel_details);
        btnAdmin = (Button)findViewById(R.id.adminUser);
        btnStudent = (Button)findViewById(R.id.studentUser);
        btnAdmin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent4 = new Intent(getApplicationContext(), AdminLoginActivity.class);
                startActivity(intent4);
            }
        });

        btnStudent.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent5 = new Intent(getApplicationContext(), StudentLoginActivity.class);
                startActivity(intent5);
            }
        });

    }
}
