package com.empirer.shoppingapp;

import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class ProductDetailActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_product_detail);

        Product product = (Product) getIntent().getSerializableExtra("product");

        TextView nameView = findViewById(R.id.product_name);
        TextView descView = findViewById(R.id.product_description);
        TextView priceView = findViewById(R.id.product_price);
        Button addToCartButton = findViewById(R.id.add_to_cart_button);

        nameView.setText(product.getName());
        descView.setText(product.getDescription());
        priceView.setText("$" + product.getPrice());

        addToCartButton.setOnClickListener(v -> {
            Cart.getInstance().addToCart(product);
            Toast.makeText(this, "Added to cart", Toast.LENGTH_SHORT).show();
        });
    }
}