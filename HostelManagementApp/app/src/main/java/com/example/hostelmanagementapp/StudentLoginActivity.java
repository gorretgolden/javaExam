package com.example.hostelmanagementapp;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class StudentLoginActivity extends Activity {

    DatabaseHelper DB = new DatabaseHelper(this);
    EditText username, password;
    Button loginbtn;
    Intent intent_1;
    TextView register_here;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.student_login_layout);

        username = (EditText) findViewById(R.id.etUserName);
       password = (EditText) findViewById(R.id.etPassWord);
        loginbtn = (Button) findViewById(R.id.bLogin);
        register_here =(TextView)  findViewById(R.id.tvRegisterHERE);


        loginbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
              String  user = username.getText().toString();
              String passward1 = password.getText().toString();

              if(user.equals("") || passward1.equals("")){
                  Toast.makeText(StudentLoginActivity.this, "Please enter all fields", Toast.LENGTH_SHORT).show();

              }else{
                  Boolean checkstudentpass = DB.checkstudentnamepassward(user,passward1);
                  if(checkstudentpass==true){
                      Toast.makeText(StudentLoginActivity.this, "Sucessfully logged in", Toast.LENGTH_SHORT).show();
                      intent_1 = new Intent(getApplicationContext(), StudentDashboard.class);
                      startActivity(intent_1);
                  }else
                  {
                      Toast.makeText(StudentLoginActivity.this, "Invalid credentials", Toast.LENGTH_SHORT).show();
                  }
              }

            }
        });

        register_here.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                intent_1 = new Intent(getApplicationContext(), StudentRegister.class);
                startActivity(intent_1);
            }
        });

    }
}



