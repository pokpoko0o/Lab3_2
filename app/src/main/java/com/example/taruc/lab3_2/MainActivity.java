package com.example.taruc.lab3_2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void showMessage(View view){
        TextView textViewmsg = findViewById(R.id.textViewMessage);
        if(textViewmsg.getVisibility()==View.INVISIBLE)
            textViewmsg.setVisibility(View.VISIBLE);
        else
            textViewmsg.setVisibility(View.INVISIBLE);
    }
}
