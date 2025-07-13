# Simple Shopping Cart App (E-Commerce Demo)

This is an Android-based shopping application where users can view a list of products, see product details, add items to their cart, view and manage their cart, and finally simulate a checkout process. The project demonstrates object-oriented principles, data passing between activities, and adapter-based UI population.

![image alt](https://github.com/Muzammil-khan-uni/Android-Shopping-App/blob/main/Output%20SS/S1.jpg)

![image alt](https://github.com/Muzammil-khan-uni/Android-Shopping-App/blob/main/Output%20SS/S2.jpg)

![image alt](https://github.com/Muzammil-khan-uni/Android-Shopping-App/blob/main/Output%20SS/S3.jpg)

![image alt](https://github.com/Muzammil-khan-uni/Android-Shopping-App/blob/main/Output%20SS/S4.jpg)

![image alt](https://github.com/Muzammil-khan-uni/Android-Shopping-App/blob/main/Output%20SS/S5.jpg)


🧱 Technologies Used:

Java

Android SDK

XML Layouts

ListView & Custom Adapters

Intents & Serialization

✅ Key Features:

1. MainActivity - Product Listing

Displays a list of available products using ListView and a custom ProductAdapter.

Users can click on a product to view its details.

Contains a "View Cart" button that navigates to the Cart.

2. ProductDetailActivity - Product Details

Receives a Product object via intent and displays its:

Name

Description

Price

Users can add the product to their cart using the "Add to Cart" button.

3. CartActivity - Cart Management

Displays all products added to the cart using a CartAdapter.

Users can:

View item names and prices

Remove items from the cart using a Remove button

Displays total cart price

Has a "Checkout" button that proceeds to order placement.

4. CheckoutActivity - Final Checkout

Displays the total amount for the current cart.

When the "Place Order" button is clicked:

Cart is cleared

A success message is shown

User is redirected back to MainActivity.

5. Cart - Singleton Cart Management Class

A singleton Cart class holds the shopping cart data in memory.

Functions:

Add/remove products

Calculate total

Clear cart

Access cart from any activity

🧾 Class Responsibilities:

Product.java

A serializable data model class with:

name, description, price

Encapsulated using private fields and public getters.

ProductAdapter.java

Custom BaseAdapter for displaying product list in MainActivity.

Binds product name and price to the layout.

CartAdapter.java

Custom BaseAdapter for displaying cart items in CartActivity.

Includes a remove button to delete items from the cart.

Cart.java

Singleton pattern ensures only one cart instance across the app.

Acts as an in-memory shopping cart.

🧩 Data Flow:

MainActivity ➝ Product selected ➝ ProductDetailActivity

Add to cart ➝ Product stored in Cart singleton

CartActivity ➝ Displays cart using CartAdapter

CheckoutActivity ➝ Total shown ➝ Cart cleared ➝ Back to MainActivity

📐 Layout Summary:

Your layout XML files likely include the following:

activity_main.xml ➝ ListView for products, View Cart button

product_list_item.xml ➝ Custom layout for a product in the list

activity_product_detail.xml ➝ Views to show full product info and add to cart

activity_cart.xml ➝ ListView for cart items, Checkout button

cart_list_item.xml ➝ Layout for each item in the cart list with a remove button

activity_checkout.xml ➝ Total price display, Place Order button



