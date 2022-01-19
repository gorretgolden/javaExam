
package com.example.hostelmanagementapp;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import androidx.annotation.Nullable;

public class DatabaseHelper extends SQLiteOpenHelper {


    public  static  final String DBNAME = "Login.db";

    public DatabaseHelper( Context context) {
        super(context, "Login.db" ,null, 1);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL("create Table students(student_name TEXT, registration_number TEXT primary key, student_passward Text)");

    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        db.execSQL("drop Table if exists students");

    }

    public Boolean insertData(String student_name,String registration_number, String student_passward ){
        SQLiteDatabase db = this.getWritableDatabase();
        ContentValues contentValues = new ContentValues();
        contentValues.put("student_name",student_name);
        contentValues.put(" registration_number", registration_number);
        contentValues.put("student_passward",student_passward);
        long result = db.insert("students",null,contentValues);

        if (result==-1) return false;
        else
            return true;
    }

    public Boolean checkstudentname(String student_name ){
        SQLiteDatabase db = this.getWritableDatabase();
        Cursor cursor = db.rawQuery("SELECT * FROM students where  student_name=? ", new String[]{student_name});
        if (cursor.getCount()>0)
            return  true;
        else
            return false;
    };


    public Boolean checkstudentregistration(String registration_number){
        SQLiteDatabase db = this.getWritableDatabase();
        Cursor cursor = db.rawQuery("SELECT * FROM students where  student_name=? ", new String[]{registration_number});
        if (cursor.getCount()>0)
            return  true;
        else
            return false;
    };


    public Boolean checkstudentnamepassward(String student_name, String student_passward ){
        SQLiteDatabase db = this.getWritableDatabase();
        Cursor cursor = db.rawQuery("SELECT * FROM students where  student_name=? and  student_passward=?", new String[]{student_name,student_passward });
        if (cursor.getCount()>0)
            return  true;
        else
            return false;
    };

}