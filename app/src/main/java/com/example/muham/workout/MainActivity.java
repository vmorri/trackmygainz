package com.example.muham.workout;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.app.Activity;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button start = (Button) findViewById(R.id.Start);
        Button addworkout = (Button) findViewById(R.id.add);

        start.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                setContentView(R.layout.workout);
            }
        });
        addworkout.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                setContentView(R.layout.add);
            }
        });


    }
}
