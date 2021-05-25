package org.vending.machine.model;

public enum COIN {

  PENNY(1),
  TWO_PENCE(2),
  FIVE_PENCE(5),
  TEN_PENCE(10),
  TWENTY_PENCE(20),
  FIFTY_PENCE(50),
  ONE_POUND(100),
  TWO_POUND(200);

  COIN(int value) {
    this.value = value;
  }

  public int getValue() {
    return value;
  }

  private final int value;


}
