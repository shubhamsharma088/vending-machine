package org.vending.machine.config;

import java.util.Map;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.DependsOn;
import org.vending.machine.model.COIN;
import org.vending.machine.model.PRODUCT;
import org.vending.machine.service.InitService;
import org.vending.machine.state.VendingMachine;

@Configuration
public class AppConfig {


  @Bean
  @DependsOn({"coinMap", "productMap"})
  public VendingMachine vendingMachine(Map<COIN, Integer> coinMap,
      Map<PRODUCT, Integer> productMap) {
    return new VendingMachine(coinMap, productMap);
  }

  @Bean
  public Map<COIN, Integer> coinMap(InitService initService) {
    return initService.initializeFloats();
  }

  @Bean
  public Map<PRODUCT, Integer> productMap(InitService initService) {
    return initService.initializeInventory();
  }

  @Bean
  public InitService initService() {
    return new InitService();
  }

}
