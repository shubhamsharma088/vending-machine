package org.vending.machine.service;


import static org.vending.machine.model.COIN.FIFTY_PENCE;
import static org.vending.machine.model.COIN.FIVE_PENCE;
import static org.vending.machine.model.COIN.ONE_POUND;
import static org.vending.machine.model.COIN.PENNY;
import static org.vending.machine.model.COIN.TEN_PENCE;
import static org.vending.machine.model.COIN.TWENTY_PENCE;
import static org.vending.machine.model.COIN.TWO_PENCE;
import static org.vending.machine.model.COIN.TWO_POUND;
import static org.vending.machine.model.PRODUCT.values;

import java.util.Map;
import org.eclipse.collections.impl.map.mutable.ConcurrentHashMap;
import org.vending.machine.model.COIN;
import org.vending.machine.model.PRODUCT;

public class InitService {


  public Map<COIN, Integer> initializeFloats() {
    final ConcurrentHashMap<COIN, Integer> coinMap = new ConcurrentHashMap<>();

    coinMap.put(PENNY, 100);
    coinMap.put(TWO_PENCE, 100);
    coinMap.put(FIVE_PENCE, 100);
    coinMap.put(TEN_PENCE, 100);
    coinMap.put(TWENTY_PENCE, 100);
    coinMap.put(FIFTY_PENCE, 100);
    coinMap.put(ONE_POUND, 100);
    coinMap.put(TWO_POUND, 100);

    return coinMap;
  }


  public Map<PRODUCT, Integer> initializeInventory() {

    final ConcurrentHashMap<PRODUCT, Integer> productMap = new ConcurrentHashMap<>();

    for (PRODUCT product : values()) {
      productMap.put(product, 20);
    }
    return productMap;
  }
}
