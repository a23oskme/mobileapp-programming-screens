package com.example.screens;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.content.Intent;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // hitta knappen
        Button button = findViewById(R.id.main_activity_button);

        button.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    // skapa en intent för att öppna SecondActivity
                    Intent intent = new Intent(MainActivity.this, SecondActivity.class);

                    // lägg till data i intent
                    intent.putExtra("key", "Hej!");

                    // starta SecondActivity
                    startActivity(intent);
                }
            });
    }
}
