package com.example.postcreate.navigation;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;

import com.example.postcreate.R;


public  class CreatepostActivity extends AppCompatActivity {
    EditText etInput1;
    Button btntitlehere, btncomments, btnpost;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_createpost);

        init();

        btntitlehere.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                titlehere();
            }
        });

        btncomments.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                comments();
            }
        });

        btnpost.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                post();
            }
        });
    }

    private void titlehere() {
    }

    private void comments() {
        int a = parse(etInput1.getText().toString());

    }

    private void post() {
    }

    private int parse(String value) {
        return Integer.parseInt(value);
    }


    private void init() {
        btntitlehere = findViewById(R.id.btntitlehere);
        btncomments = findViewById(R.id.btncomments);
        btnpost = findViewById(R.id.btnpost);

    }
}




























