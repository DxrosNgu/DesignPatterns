package edu.designpatterns.structural.decorator;

import java.util.ArrayList;

public class PizzaHawaiian implements Pizza {

  ArrayList<String> toppings = new ArrayList<>();
  String name = "Hawaiiian";

  public PizzaHawaiian() {
    toppings.add("cheese");
    toppings.add("tomato");
    toppings.add("ham");
    toppings.add("pineapple");
  }


  public ArrayList getToppings() {
    return toppings;
  }

  public String getName() {
    return name;
  }

}