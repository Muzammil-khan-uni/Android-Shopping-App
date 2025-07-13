package com.empirer.shoppingapp;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class CheckoutActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_checkout);

        TextView totalView = findViewById(R.id.total_amount);
        Button placeOrderButton = findViewById(R.id.place_order_button);

        double totalAmount = Cart.getInstance().getTotal();
        totalView.setText("Total: $" + totalAmount);

        placeOrderButton.setOnClickListener(v -> {
            Cart.getInstance().clearCart();
            Toast.makeText(this, "Order placed successfully!", Toast.LENGTH_SHORT).show();
            Intent intent = new Intent(CheckoutActivity.this, MainActivity.class);
            startActivity(intent);
        });
    }
}