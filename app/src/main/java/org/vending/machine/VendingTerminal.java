package org.vending.machine;

import org.springframework.shell.standard.ShellComponent;
import org.springframework.shell.standard.ShellMethod;

@ShellComponent
public class VendingTerminal {

  @ShellMethod("Order by ID.")
  public String order(int id) {
    return "Here is your order " + id;
  }
}

