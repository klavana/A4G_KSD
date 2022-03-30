package com.example.a4g_ksd;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void moveToAddItemToList(View v) {
        Intent intent = new Intent(this, AddItemToList.class);
      //  intent.putExtra("answer", ansStr);
        startActivity(intent);
    }
}