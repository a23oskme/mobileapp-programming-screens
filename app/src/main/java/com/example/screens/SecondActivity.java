package com.example.screens;

import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import com.example.screens.R;

public class SecondActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        // hitta textview
        TextView textView = findViewById(R.id.second_activity_textview);

        // hämta den skickade strängen
        String message = getIntent().getStringExtra("message");

        // sätt texten i textview
        textView.setText(message);
    }
}