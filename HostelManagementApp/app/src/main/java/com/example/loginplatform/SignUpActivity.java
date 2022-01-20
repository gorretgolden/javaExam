package com.example.loginplatform;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class SignUpActivity extends Activity {

        TextView text1;
        EditText studentname,regnumber,pas1,pas2;
        Button button;
        String username,reg_no,passward1,passward2;
        Intent intentStudentDashboard,intentLogin;

        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.signup_layout);

            button = (Button) findViewById(R.id.bRegister);
            text1 = (TextView) findViewById(R.id.txt2);
            studentname = (EditText) findViewById(R.id.etName);
            regnumber = (EditText) findViewById(R.id.etUserNo);

            pas1 = (EditText) findViewById(R.id.etPassWord);
            pas2 = (EditText) findViewById(R.id.etConfirmPassWord);


            button.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    //converting the user input into string
                    username = studentname.getText().toString();
                    reg_no = regnumber.getText().toString();
                    passward1 = pas1.getText().toString();
                    passward2 = pas2.getText().toString();


//validations

                    if (username.isEmpty()) {
                        studentname.setError("student name is required");
                    }

                    if (reg_no.isEmpty()) {
                        regnumber.setError("student registration number is required");
                    }


                    if (passward1.isEmpty()) {
                        pas1.setError("Please enter your passward");
                    }

                    if (passward2.isEmpty()) {
                        pas2.setError("Please confirm your passward");
                    }

                    if (passward1 != passward2) {

                        pas2.setError("Passwards don't match");
                    } else {
                       intentStudentDashboard = new Intent(getApplicationContext(),StudentDashboard.class);
                       startActivity(intentStudentDashboard);

                    }
                }
            });
            text1.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    intentLogin = new Intent(getApplicationContext(), StudentLoginActivity.class);
                    startActivity(intentLogin);
                }
            });

        }
}
