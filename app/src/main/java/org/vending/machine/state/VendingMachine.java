package org.vending.machine.state;

import java.util.Map;
import org.vending.machine.model.COIN;
import org.vending.machine.model.PRODUCT;

public class VendingMachine {

  private Map<COIN, Integer> coinMap;
  private Map<PRODUCT, Integer> productMap;

  public VendingMachine(Map<COIN, Integer> coinMap,
      Map<PRODUCT, Integer> productMap) {
    this.coinMap = coinMap;
    this.productMap = productMap;
  }

  public Map<COIN, Integer> getCoinMap() {
    return coinMap;
  }

  public void setCoinMap(Map<COIN, Integer> coinMap) {
    this.coinMap = coinMap;
  }

  public Map<PRODUCT, Integer> getProductMap() {
    return productMap;
  }

  public void setProductMap(Map<PRODUCT, Integer> productMap) {
    this.productMap = productMap;
  }
}
