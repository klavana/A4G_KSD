package com.example.a4g_ksd;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class AddItemToList extends AppCompatActivity {

    //Data
    EditText editItemQuantity, editItemName;
    String quantityStr;
    int quantity;
    String name;

    @Override
    //"Constructor"
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.additemtolist);
        // must be initialized in constructor
        editItemQuantity= findViewById(R.id.editItemQuantity);
        editItemName = findViewById(R.id.EditItemName);
        Intent intent = getIntent();
        Toast.makeText(getApplicationContext(),"Add Item to List Working",Toast.LENGTH_SHORT).show();
    }

    // Methods
    public void addOffer(View v){
        quantityStr = editItemQuantity.getText().toString();
        quantity = Integer.parseInt(quantityStr);
        name = editItemQuantity.getText().toString();
        Item i = new Item(name, quantity);
        final Controller controller = (Controller) getApplicationContext();
        controller.getUser().addItem(i);
        Toast.makeText(getApplicationContext(),"Add Offer",Toast.LENGTH_SHORT).show();

    }
}
