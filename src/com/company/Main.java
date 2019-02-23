package com.company;

import java.util.Calendar;

public class Main {

  public static void main(String[] args) {
    GenericItem item1 = new GenericItem();
    item1.ID = ++GenericItem.IDs;
    item1.name = "Steins;Gate";
    item1.price = 30.01;
    item1.category = Category.GAME;

    GenericItem item2 = new GenericItem();
    item2.ID = ++GenericItem.IDs;
    item2.name = "Mass Effect";
    item2.price = 59.99;
    item2.category = Category.GAME;

    GenericItem item3 = new GenericItem();
    item3.ID = ++GenericItem.IDs;
    item3.name = "DOOM";
    item3.price = 6.66;
    item3.category = Category.GAME;

    FoodItem cake = new FoodItem();
    cake.ID = ++GenericItem.IDs;
    cake.name = "Napoleon";
    cake.price = 9999.99;
    cake.category = Category.FOOD;
    cake.dateOfIncome = Calendar.getInstance();
    cake.dateOfIncome.set(2018, Calendar.DECEMBER, 28);
    cake.expires = 5;

    TechnicalItem glider = new TechnicalItem();
    glider.ID = ++GenericItem.IDs;
    glider.name = "Water Glider";
    glider.price = 349.49;
    glider.warrantyTime = 365;

    GenericItem[] itemsList = new GenericItem[2];
    itemsList[0] = cake;
    itemsList[1] = glider;

    item1.printAll();
    item2.printAll();
    item3.printAll();

    for (GenericItem gi : itemsList) {
      gi.printAll();
    }

    item2 = item1;
    System.out.print(item1.equals(item2));
  }
}
