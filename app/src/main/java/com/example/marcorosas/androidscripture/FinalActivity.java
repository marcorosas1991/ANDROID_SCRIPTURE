package com.example.marcorosas.androidscripture;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.text.Editable;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class FinalActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_final);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });

        TextView myTextView = (TextView)findViewById(R.id.lbl_final);

        Intent i = getIntent();
        String txt_book = i.getStringExtra("txt_book");
        String txt_chapter = i.getStringExtra("txt_chapter");
        String txt_verse = i.getStringExtra("txt_verse");

        String output = "Your favorite scripture is " + txt_book + " " + txt_chapter + ":" + txt_verse;

        myTextView.setText(output);
    }
}
