package com.example.iliass.tp2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    Button btnActivity1 ;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnActivity1 = (Button) findViewById(R.id.button) ;
        btnActivity1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                myClick(v) ;
            }
        });
    }


    public void myClick(View v){
        Intent intent = new Intent(this,Mylist3.class) ;
        this.startActivity(intent);
    }
}
