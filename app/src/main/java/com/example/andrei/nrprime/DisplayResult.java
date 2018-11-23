package com.example.andrei.nrprime;

import android.content.Intent;
import android.graphics.Color;
import android.support.constraint.ConstraintLayout;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.RelativeLayout;
import android.widget.TextView;

public class DisplayResult extends AppCompatActivity {
    public String message;
    public TextView result;
    public ConstraintLayout current;
    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_display_result);
        result = findViewById(R.id.result);
        Intent intent = getIntent();
        message = intent.getStringExtra("mesaj");
        TextView number = findViewById(R.id.textView);
        number.setText(message);
        current = findViewById(R.id.the_layout);
        prime();
    }

    public void prime(){
        double nr = Double.parseDouble(message);
        int nri = (int)nr;
        boolean prime = true;
        for (int i = 2; i * i <= nr; i++) {
            if (nr % i == 0 ) {
                prime = false;
                break;
            }
        }

        if(nr!=nri)prime=false;
        if(nr<0)prime=false;

        if(prime){
                this.result.setText("nr prim");
                current.setBackgroundColor(Color.parseColor("#59ff74"));
        }
        else{
                this.result.setText("nu e nr prim");
                current.setBackgroundColor(Color.parseColor("#e01600"));
        }
    }
}
