//package com.example.hostelmanagementapp;
//
//
//
//import android.app.Activity;
//import android.os.Bundle;
//import android.widget.ArrayAdapter;
//import android.widget.ListView;
//
//public class ListActivity extends Activity {
//    ListView Lv;
//    String countries[] = {"Burgers","Pizza","Chips"};
//    @Override
//    protected void onCreate(Bundle savedInstanceState) {
//        super.onCreate(savedInstanceState);
//        setContentView(R.layout.admin_dashboard_layout);
//
//        Lv  = (ListView)findViewById(R.id.lv);
//        ArrayAdapter<String> newAdapter = new ArrayAdapter<>(this,R.layout.activity_main,R.id.textview,countries);
//        Lv.setAdapter(newAdapter);
//    }
//}
