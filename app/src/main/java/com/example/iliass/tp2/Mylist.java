package com.example.iliass.tp2;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class Mylist extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        ArrayList<Etablissement> Etablissements = new ArrayList<Etablissement>() ;


        Etablissement etablissement1 = new Etablissement("Ensias","shcool of tech" ,R.drawable.logo5_0) ;

        Etablissements.add(etablissement1) ;

// get the reference of RecyclerView
        RecyclerView rv = (RecyclerView) findViewById(R.id.list);
// set a LinearLayoutManager with default vertical orientation
        rv.setLayoutManager(new LinearLayoutManager(this));
// call the constructor of MyAdapter to send the reference and data to Adapter
        rv.setAdapter(new MyAdapter(this, Etablissements));
    }
}
