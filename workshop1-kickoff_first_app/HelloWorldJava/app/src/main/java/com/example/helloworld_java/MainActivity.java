package com.example.helloworld_java;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private EditText nameInput;
    private TextView text;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        this.nameInput = findViewById(R.id.name_input);
        this.text = findViewById(R.id.main_text);
    }

    public void updateName(View view) {
        text.setText("Hello " + nameInput.getText().toString() + " ");
    }
}