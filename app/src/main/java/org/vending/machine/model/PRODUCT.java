package org.vending.machine.model;

public enum PRODUCT {

  CAPPUCCINO(2.49),
  HAM_SANDWICH(6.99),
  HOT_CHOCOLATE(1.99),
  LATTE(1.99),
  OREO(2),
  TEA(1.49),
  VEGAN_SANDWICH(4.99);

  private final double price;

  PRODUCT(double price) {
    this.price = price;
  }
}
