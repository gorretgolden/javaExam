package com.example.hostelmanagementapp;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;
import com.example.hostelmanagementapp.DatabaseHelper;
public class StudentRegister extends Activity {

    DatabaseHelper helper= new DatabaseHelper(this);
    DatabaseHelper DB;
    EditText username,regnumber,pas1,pas2;
    Button button;
    String student,reg_no,passward1,passward2;
    Intent intent,intent_1;
    TextView login_here;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.student_login_layout);

        button = (Button) findViewById(R.id.bRegister);
        username = (EditText) findViewById(R.id.etName);
        regnumber = (EditText) findViewById(R.id.etUserNo);
        pas1 = (EditText) findViewById(R.id.etPassWord);
        pas2 = (EditText) findViewById(R.id.etConfirmPassWord);
        login_here = (TextView) findViewById(R.id.tvLoginHERE);
        DB = new DatabaseHelper(this);


        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                //converting the user input into string
                student = username.getText().toString();
                reg_no = regnumber.getText().toString();
                passward1 = pas1.getText().toString();
                passward2 = pas2.getText().toString();


//validations

                if (student.isEmpty()) {
                    username.setError("Student name is required");
                }

                if (reg_no.isEmpty()) {
                    regnumber.setError("Student registration number is required");
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
                    if(passward1.equals(passward2)){
                        Boolean checkstudent = DB.checkstudentname(student);
                        if(checkstudent == false){
                            Boolean insertStudent = DB.insertData(student,reg_no,passward1);
                            if(insertStudent==true){
                                Toast.makeText(StudentRegister.this, "Registered successfully", Toast.LENGTH_SHORT).show();
                                intent = new Intent(getApplicationContext(),StudentDashboard.class);
                                startActivity(intent);
                            }else{
                                Toast.makeText(StudentRegister.this, "Registered failed", Toast.LENGTH_SHORT).show();
                            }

                        }
                        else{
                            Toast.makeText(StudentRegister.this, "Student already exists please sign-in", Toast.LENGTH_SHORT).show();
                        }


                    }
                    else{
                        Toast.makeText(StudentRegister.this, "Password dont match!", Toast.LENGTH_SHORT).show();
                    }

                }
            }
        });
        login_here.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                intent_1 = new Intent(getApplicationContext(), StudentLoginActivity.class);
                startActivity(intent_1);
            }
        });

    }


    }




