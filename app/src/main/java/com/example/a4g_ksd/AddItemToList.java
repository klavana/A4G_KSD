package com.example.a4g_ksd;

import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class AddItemToList extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.additemtolist);

        Intent intent = getIntent();
        TextView answerText = findViewById(R.id.TesterThings);
        answerText.setText("working lol");
    }
}
