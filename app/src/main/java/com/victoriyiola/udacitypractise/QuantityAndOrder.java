/*
 * Copyright Victor I. Afolabi © 2017. All rights reserved.
 */

package com.victoriyiola.udacitypractise;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class QuantityAndOrder extends AppCompatActivity {

  @Override
  protected void onCreate(@Nullable Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_quantity_and_order);
  }

  public void submitOrder(View view) {
    display(1);
  }

  public void display(int number) {

  }

}
