package org.vending.machine.service;

import org.vending.machine.model.Order;
import org.vending.machine.model.PRODUCT;

abstract public class OrderService {


  abstract public void processOrder(Order order);


  abstract public Order addToOrder(PRODUCT productOLD);


}
