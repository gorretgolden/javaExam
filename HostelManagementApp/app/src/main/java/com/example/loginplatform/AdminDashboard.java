package com.example.loginplatform;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class AdminDashboard extends Activity {
    Button adminBack;
    TextView logout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.admin_dashboard_layout);

        adminBack = (Button) findViewById(R.id.profBack);
        logout = (TextView) findViewById(R.id.tvAdminLogout);

        adminBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
              Intent  intentAdminBack = new Intent(getApplicationContext(), ProfileActivity.class);
                startActivity(intentAdminBack);
            }
        });

        logout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentLogout = new Intent(getApplicationContext(), AdminLoginActivity.class);
                startActivity(intentLogout);
            }
        });

    }
}
