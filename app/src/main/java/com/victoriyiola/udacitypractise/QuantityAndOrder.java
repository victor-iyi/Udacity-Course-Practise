/*
 * Copyright Victor I. Afolabi © 2017. All rights reserved.
 */

package com.victoriyiola.udacitypractise;

import android.os.Build;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

import java.text.NumberFormat;

public class QuantityAndOrder extends AppCompatActivity {

  private int quantity = 0;

  @Override
  protected void onCreate(@Nullable Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_quantity_and_order);
  }

  /**
   * Fires when the "order" button is clicked.
   *
   * @param view View
   */
  public void submitOrder(View view) {
    displayPrice(quantity * 5);
  }

  /**
   * Displays the calculated quantity into the quantity text view.
   *
   * @param quantity int
   */
  public void displayQuantity(int quantity) {
    TextView quantityTextView = (TextView) findViewById(R.id.quantity_text_view);
    quantityTextView.setText(String.valueOf(quantity));
  }

  /**
   * Displays the calculated price into the price text view.
   *
   * @param price int
   */
  public void displayPrice(int price) {
    TextView priceTextView = (TextView) findViewById(R.id.price_text_view);
    if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.N)
      priceTextView.setText(NumberFormat.getCurrencyInstance().format(price));
    else
      priceTextView.setText(String.format("$%s.00", String.valueOf(price)));
  }

  /**
   * Increments the quantity by 1.
   * The quantity can be as high as possible.
   *
   * @param view View
   */
  public void increment(View view) {
    quantity++;
    displayQuantity(quantity);
  }

  /**
   * Decrements the quantity by 1.
   * It is important to know that the quantity cannot be less than 1
   *
   * @param view View
   */
  public void decrement(View view) {
    if (quantity > 0)
      quantity--;
    displayQuantity(quantity);
  }

}
