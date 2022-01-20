package com.example.loginplatform;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class LoginActivity extends Activity {

    Button btn2;
    EditText user, passward1;
    String username = "gorret";
    String passward_1 = "admin";
    Intent intent;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        //refrencing ids into the java classs
        setContentView(R.layout.login_layout);
        btn2 = (Button) findViewById(R.id.btn2);
        user = (EditText) findViewById(R.id.edt_1);
        passward1 = (EditText) findViewById(R.id.edt_2);

        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                username = user.getText().toString();
                passward_1 = passward1.getText().toString();

                if (username != "gorret") {
                    user.setError("Wrong passward");
                }
                if (username.isEmpty()) {
                    user.setError("Please enter your username");
                }
                if (passward_1.isEmpty() & passward_1 != "admin") {
                    passward1.setError("Wrong passward");
                } else {
                    intent = new Intent(getApplicationContext(), HomeActivity.class);
                    startActivity(intent);
                }
            }
        });

    }
}
