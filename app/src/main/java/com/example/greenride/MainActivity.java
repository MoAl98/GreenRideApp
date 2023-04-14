package com.example.greenride;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //göra ett objekt av knapp-typ, och sedan en onclicklistener
        Button buttonSignIn = (Button) findViewById(R.id.buttonSignIn);
        buttonSignIn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //i onclick-metoden ska vi kalla på Activity2
                openActivity1();
            }
        });
    }
    //Nu ska vi skapa metoden för att öppna Activity1
    public void openActivity1(){
        //Vi ska skapa en intent.
        Intent intent = new Intent(this, Activity1.class);
        startActivity(intent);
    }
}
