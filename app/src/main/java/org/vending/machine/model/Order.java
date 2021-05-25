package org.vending.machine.model;

import java.util.List;
import java.util.Objects;

public class Order {

  private List<PRODUCT> items;

  public List<PRODUCT> getItems() {
    return items;
  }

  public void setItems(List<PRODUCT> items) {
    this.items = items;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Order order = (Order) o;
    return Objects.equals(items, order.items);
  }

  @Override
  public int hashCode() {
    return Objects.hash(items);
  }
}
