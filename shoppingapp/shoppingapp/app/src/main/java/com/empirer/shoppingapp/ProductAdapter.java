package com.empirer.shoppingapp;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.BaseAdapter;
import java.util.ArrayList;

public class ProductAdapter extends BaseAdapter {

    private final Context context;
    private final ArrayList<Product> productList;

    public ProductAdapter(Context context, ArrayList<Product> productList) {
        this.context = context;
        this.productList = productList;
    }

    @Override
    public int getCount() {
        return productList.size();
    }

    @Override
    public Object getItem(int position) {
        return productList.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        if (convertView == null) {
            convertView = LayoutInflater.from(context).inflate(R.layout.product_list_item, parent, false);
        }

        Product product = productList.get(position);

        TextView productName = convertView.findViewById(R.id.product_name);
        TextView productPrice = convertView.findViewById(R.id.product_price);

        productName.setText(product.getName());
        productPrice.setText(String.format("$%.2f", product.getPrice()));

        return convertView;
    }
}

