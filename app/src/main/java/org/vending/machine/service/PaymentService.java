package org.vending.machine.service;

import java.util.Map;
import org.vending.machine.model.COIN;

abstract public class PaymentService {


  /**
   * @param coins Provided by the customer
   * @return the remaining change
   */
  abstract public Map<COIN, Integer> makePayment(Map<COIN, Integer> coins);


  /**
   * Updates coin the vending machine
   *
   * @param coins
   */
  abstract public void processPayment(Map<COIN, Integer> coins);

}
