package com.company;

import java.util.Calendar;

public class FoodItem extends GenericItem {

  public Calendar dateOfIncome; // Дата производства
  public short expires; // Срок годности

  public FoodItem(String name, double price, FoodItem analogue, Calendar dateOfIncome,
      short expires) {
    this.name = name;
    this.price = price;
    this.analogue = analogue;
    this.dateOfIncome = dateOfIncome;
    this.expires = expires;
  }

  public FoodItem(String name, double price, short expires) {
    this(name, price, null, Calendar.getInstance(), expires);
  }

  public FoodItem(String name) {
    this(name, 1, null, Calendar.getInstance(), (short) 5);
  }

  public FoodItem() {

  }

  void printAll() {
    super.printAll();
    System.out
        .printf("Date of income:" + dateOfIncome.getTime() + " , expires in %d days \n", expires);
  }

}
