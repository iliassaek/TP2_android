package com.example.iliass.tp2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;

public class Mylist2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);


        ArrayList<Etablissement> Etablissements = new ArrayList<Etablissement>() ;


        Etablissement etablissement1 = new Etablissement("Ensias","shcool of tech" ,0) ;

        Etablissements.add(etablissement1) ;



// get the reference of RecyclerView
        RecyclerView rv = (RecyclerView) findViewById(R.id.list);
// set a LinearLayoutManager with default vertical orientation
        rv.setLayoutManager(new LinearLayoutManager(this));
// call the constructor of MyAdapter to send the reference and data to Adapter
        rv.setAdapter(new MyAdapter(this, Etablissements));
    }
}
