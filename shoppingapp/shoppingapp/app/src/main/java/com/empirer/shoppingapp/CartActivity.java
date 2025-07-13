package com.empirer.shoppingapp;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.ListView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class CartActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cart);

        ListView cartListView = findViewById(R.id.cart_list);
        Button checkoutButton = findViewById(R.id.checkout_button);

        Cart cart = Cart.getInstance();
        CartAdapter adapter = new CartAdapter(this, cart.getItems());
        cartListView.setAdapter(adapter);

        checkoutButton.setOnClickListener(v -> {
            if (cart.getItems().isEmpty()) {
                Toast.makeText(this, "Cart is empty", Toast.LENGTH_SHORT).show();
            } else {
                double totalPrice = cart.getTotal();
                Toast.makeText(this, "Total: $" + totalPrice, Toast.LENGTH_SHORT).show();

                adapter.notifyDataSetChanged();
                Intent intent = new Intent(CartActivity.this, CheckoutActivity.class);
                startActivity(intent);
            }
        });

    }

}
