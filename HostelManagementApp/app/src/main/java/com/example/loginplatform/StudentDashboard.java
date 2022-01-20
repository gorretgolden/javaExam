package com.example.loginplatform;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

public class StudentDashboard extends Activity {
    Button hostel;
    TextView logout;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.student_dashboard);


        final ArrayList<NumbersView> arrayList = new ArrayList<NumbersView>();

        hostel = (Button)findViewById(R.id.btnHostel);
        logout = (TextView) findViewById(R.id.tvStudentLogout);


        hostel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent1 = new Intent(getApplicationContext(), HostelDetails.class);
                startActivity(intent1);
            }
        });

        logout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentLogout = new Intent(getApplicationContext(), StudentLoginActivity.class);
                startActivity(intentLogout);
            }
        });



        arrayList.add(new NumbersView(R.drawable.htl1, " 1. Bascon Hostel", "Price $20"));
        arrayList.add(new NumbersView(R.drawable.ht2, " 2. JJ Hostel", "Price $30"));
        arrayList.add(new NumbersView(R.drawable.htl4, "3. Namah Hostel", "Price $40"));
        arrayList.add(new NumbersView(R.drawable.htl6, "4. Carrie Hostel", "Price $50"));
        arrayList.add(new NumbersView(R.drawable.htl5, "5. Aman Hostel", "Price $12"));




        NumbersViewAdapter numbersArrayAdapter = new NumbersViewAdapter(this, arrayList);

        // create the instance of the ListView to set the numbersViewAdapter
        ListView numbersListView = findViewById(R.id.listView);

        // set the numbersViewAdapter for ListView
        numbersListView.setAdapter(numbersArrayAdapter);


    }
}
