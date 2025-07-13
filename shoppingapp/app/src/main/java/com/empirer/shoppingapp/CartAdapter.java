package com.empirer.shoppingapp;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import android.widget.BaseAdapter;
import java.util.ArrayList;

public class CartAdapter extends BaseAdapter {

    private final Context context;
    private final ArrayList<Product> cartItems;

    public CartAdapter(Context context, ArrayList<Product> cartItems) {
        this.context = context;
        this.cartItems = cartItems;
    }

    @Override
    public int getCount() {
        return cartItems.size();
    }

    @Override
    public Object getItem(int position) {
        return cartItems.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        if (convertView == null) {
            convertView = LayoutInflater.from(context).inflate(R.layout.cart_list_item, parent, false);
        }

        Product product = cartItems.get(position);

        TextView itemName = convertView.findViewById(R.id.cart_item_name);
        TextView itemPrice = convertView.findViewById(R.id.cart_item_price);
        Button removeButton = convertView.findViewById(R.id.remove_from_cart_button);

        itemName.setText(product.getName());
        itemPrice.setText(String.format("$%.2f", product.getPrice()));

        removeButton.setOnClickListener(v -> {
            Cart.getInstance().removeFromCart(product);
            notifyDataSetChanged();
        });

        return convertView;
    }
}
