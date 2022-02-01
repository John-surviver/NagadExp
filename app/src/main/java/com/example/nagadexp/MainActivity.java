package com.example.nagadexp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    ImageView picbl;
    TextView taptxt,taka;
    LinearLayout layout1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // assinging id
        assignId();

        // setting listener
        layout1.setOnClickListener(this);

    }


    @Override
    public void onClick(View view) {
        if (view.getId()==R.id.balance){

            taptxt.setVisibility(View.GONE);
            picbl.animate().translationX(280f).setDuration(1000);
            taka.setVisibility(View.VISIBLE);
            taka.animate().alpha(1).setDuration(1000);
            taka.animate().translationX(140f).setDuration(1000);


        }
    }


    // assign id
    public void assignId(){
        picbl=findViewById(R.id.picbl);
        taptxt=findViewById(R.id.tapforbalancetxt);
        layout1=findViewById(R.id.balance);
        taka=findViewById(R.id.taka);
    }

}