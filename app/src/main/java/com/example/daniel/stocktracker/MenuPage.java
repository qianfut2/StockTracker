package com.example.daniel.stocktracker;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.content.Intent;

public class MenuPage extends AppCompatActivity {


    private Button button1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button1 = (Button) findViewById(R.id.button);
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openGoogleInc();
            }

        });
    }
    public void openGoogleInc() {
        Intent intent = new Intent(this, GoogleInc.class);
        startActivity(intent);
    }

}
