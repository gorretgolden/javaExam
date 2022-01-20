package com.example.loginplatform;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class StudentLoginActivity extends Activity {

    EditText StudentRegNo, StudentPassword;
    Button studentLogin;
    final String registrationNumber="NabatanziQ";
    final String password ="golden";
    TextView txt;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.student_login_layout);

//        username = (EditText) findViewById(R.id.etUserName);
//        password = (EditText) findViewById(R.id.etPassWord);
//        loginbtn = (Button) findViewById(R.id.bLogin);
//        register_here =(TextView)  findViewById(R.id.registerHERE);



        StudentRegNo = (EditText) findViewById(R.id.etReg);
     StudentPassword = (EditText) findViewById(R.id.etPassWord);
     studentLogin= (Button) findViewById(R.id.bStudentLogin);
     txt = (TextView) findViewById(R.id.regStudent);


        txt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
               Intent intentRegisterStudent = new Intent(getApplicationContext(), SignUpActivity.class);
                startActivity(intentRegisterStudent);
            }
        });



        studentLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                if((registrationNumber.equals(StudentRegNo.getText().toString())) && (password.equals(StudentPassword.getText().toString()))){
                    Toast.makeText(getBaseContext()," login Successful...", Toast.LENGTH_SHORT).show();
                    Intent startStudentDashboard = new Intent(getApplicationContext(), StudentDashboard.class);
                    startActivity(startStudentDashboard);

                }else{
                    AlertDialog.Builder alertDialog = new AlertDialog.Builder(StudentLoginActivity.this);
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
