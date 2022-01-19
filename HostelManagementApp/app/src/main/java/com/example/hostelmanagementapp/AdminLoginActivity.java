package com.example.hostelmanagementapp;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class AdminLoginActivity  extends Activity {

    EditText adminUsername, adminPassword;
    Button adminLogin;
    final String userName="sobhit2017";
    final String passWord="kumar2017";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.admin_login_layout);
//        getSupportActionBar().setTitle("Admin Login");


        adminUsername= (EditText) findViewById(R.id.etAdminUserName);
        adminPassword= (EditText) findViewById(R.id.etAdminPassWord);
        adminLogin= (Button) findViewById(R.id.bAdminLogin);


        adminLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                if((userName.equals(adminUsername.getText().toString())) && (passWord.equals(adminPassword.getText().toString()))){
                    Toast.makeText(getBaseContext()," login Successful...", Toast.LENGTH_SHORT).show();
                    Intent startAdminDashboard = new Intent(getApplicationContext(), AdminLoginActivity.class);
//                    intent = new Intent(getApplicationContext(),HomeActivity.class);
                    startActivity(startAdminDashboard);

                }else{
                    AlertDialog.Builder alertDialog = new AlertDialog.Builder(AdminLoginActivity.this);
                    alertDialog.setTitle("!!!  Login Failed  !!!");

                    alertDialog.setMessage("Wrong Username or Password \n!!!  Try Again  !!!").show();

                }
            }
        });
    }
    @Override
    public void onBackPressed() {
        moveTaskToBack(true);
    }


}
