package com.example.andrei.nrprime;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class DisplayResult extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_display_result);


        Intent intent = getIntent();
        String message = intent.getStringExtra(MainActivity.EXTRA_MESSAGE);

        TextView number = findViewById(R.id.textView);
        number.setText(message);
    }
    TextView result = (TextView) findViewById(R.id.result);
    public void prime(View view){
        int nr = Integer.parseInt(MainActivity.EXTRA_MESSAGE);
        boolean prime = true;
        for (int i = 2; nr <= i; i++) {
            if (nr % i == 0 ) {
                prime = false;
                break;
            }
    }
    if(prime){
            result.setText("nr prim");
    }
    else{
            result.setText("nu e nr prim");
    }
}}
