package com.example.andrei.nrprime;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void sendMessage(View view) {

        EditText editText = (EditText) findViewById(R.id.editText);
        String message = String.valueOf(editText.getText());
        if(message.matches("-?\\d+(\\.\\d+)?")) {
            Intent intent = new Intent(MainActivity.this, DisplayResult.class);
            intent.putExtra("mesaj", message);
            startActivity(intent);
        }
        else showToast();
    }
    public void showToast(){
        Context context = getApplicationContext();
        CharSequence text = "Nu este numar!";
        int duration = Toast.LENGTH_SHORT;

        Toast toast = Toast.makeText(context, text, duration);
        toast.show();
    }
}
