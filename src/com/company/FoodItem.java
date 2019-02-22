package com.company;

import java.util.Calendar;

public class FoodItem extends GenericItem {

  public Calendar dateOfIncome; // Дата производства
  public short expires; // Срок годности

  void printAll() {
    super.printAll();
    System.out
        .printf("Date of income:" + dateOfIncome.getTime() + " , expires in %d days \n", expires);
  }

}
