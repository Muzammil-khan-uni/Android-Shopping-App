package com.empirer.shoppingapp;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;
import java.util.ArrayList;

// Home Screen Activity
public class MainActivity extends AppCompatActivity {

    ArrayList<Product> productList;
    ProductAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        productList = new ArrayList<>();
        productList.add(new Product("Product 1", "Description 1", 10.99));
        productList.add(new Product("Product 2", "Description 2", 20.49));
        productList.add(new Product("Product 3", "Description 3", 15.79));

        adapter = new ProductAdapter(this, productList);
        ListView listView = findViewById(R.id.product_list);
        listView.setAdapter(adapter);

        listView.setOnItemClickListener((parent, view, position, id) -> {
            Product selectedProduct = productList.get(position);
            Intent intent = new Intent(MainActivity.this, ProductDetailActivity.class);
            intent.putExtra("product", selectedProduct);
            startActivity(intent);
        });
        Button viewCartButton = findViewById(R.id.view_cart_button);
        viewCartButton.setOnClickListener(v -> {
            Intent intent = new Intent(MainActivity.this, CartActivity.class);
            startActivity(intent);
        });


    }
}