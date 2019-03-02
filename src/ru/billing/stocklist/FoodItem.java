package ru.billing.stocklist;

import java.util.Calendar;

public class FoodItem extends GenericItem {

  private Calendar dateOfIncome; // Дата производства
  private short expires; // Срок годности

  public FoodItem(String name, double price, FoodItem analogue, Calendar dateOfIncome,
      short expires) {
    this.setName(name);
    this.setPrice(price);
    this.setAnalogue(analogue);
    this.setDateOfIncome(dateOfIncome);
    this.setExpires(expires);
  }

  public FoodItem(String name, double price, short expires) {
    this(name, price, null, Calendar.getInstance(), expires);
  }

  public FoodItem(String name) {
    this(name, 1, null, Calendar.getInstance(), (short) 5);
  }

  public FoodItem() {

  }

  public void printAll() {
    super.printAll();
    System.out
        .printf("Date of income:" + getDateOfIncome().getTime() + " , expires in %d days \n",
            getExpires());
  }

  public Calendar getDateOfIncome() {
    return dateOfIncome;
  }

  public void setDateOfIncome(Calendar dateOfIncome) {
    this.dateOfIncome = dateOfIncome;
  }

  public short getExpires() {
    return expires;
  }

  public void setExpires(short expires) {
    this.expires = expires;
  }
}
