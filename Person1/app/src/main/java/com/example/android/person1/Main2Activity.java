package com.example.android.person1;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.TextView;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

import java.util.ArrayList;
import java.util.List;

public class Main2Activity extends AppCompatActivity {


    public List<Person> a;
    private FirebaseDatabase database=FirebaseDatabase.getInstance();
    private DatabaseReference personRef=database.getReference("person");
    private DatabaseReference peopleRef = database.getReference("Multiple");


    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);



    }
    public void set(View view){
        personRef.setValue(new Person("Ning",22,true));

    }

    public void add(View view){
        personRef.push().setValue(new Person("Brad",36,true));
    }
}


