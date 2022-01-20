package com.example.loginplatform;

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
        setContentView(R.layout.profile_layout);
        btnAdmin = (Button)findViewById(R.id.adminUser);
        btnStudent = (Button)findViewById(R.id.studentUser);


        btnAdmin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentA = new Intent(getApplicationContext(), AdminLoginActivity.class);
                startActivity(intentA);
            }
        });

        btnStudent.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentS = new Intent(getApplicationContext(), SignUpActivity.class);
                startActivity(intentS);
            }
        });

    }
}
