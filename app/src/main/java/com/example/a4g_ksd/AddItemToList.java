package com.example.a4g_ksd;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class AddItemToList extends AppCompatActivity {
    TextView editItemQuantity = findViewById(R.id.editItemQuantity);
    String Quantity = editItemQuantity.getText().toString();
    int quant = Integer.parseInt(Quantity);
    TextView EditItemName = findViewById(R.id.EditItemName);
    String Name = editItemQuantity.getText().toString();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.additemtolist);
        Intent intent = getIntent();
    }
    public void addOffer(String name, int Quantity){
        Item i = new Item(Name, quant);
        final Controller aController = (Controller) getApplicationContext();
        aController.getUser().addItem(i);
    }
}
