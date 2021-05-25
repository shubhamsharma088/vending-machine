package org.vending.machine.service;

import java.util.List;
import org.vending.machine.model.PRODUCT;

abstract public class CatalogueService {


  abstract public List<PRODUCT> getAllProducts();

  abstract public PRODUCT getProductById(String id);

  abstract public List<PRODUCT> getProductByName(String name);

  abstract public void addProduct(PRODUCT product);

  abstract public void removeProduct(PRODUCT product);

  abstract public void removeProduct(int productId);

  abstract public double getProductPrice(PRODUCT product);

  abstract public double getProductPrice(int productId);

  abstract public double getProductPrice(String name);

}
