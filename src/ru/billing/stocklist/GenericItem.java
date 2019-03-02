package ru.billing.stocklist;

public class GenericItem {

  public static int IDs = 0; // ID товара

  private int ID; // ID товара
  private String name; // Наименование товара
  private double price; // Цена товара
  private Category category = Category.GENERAL;
  private GenericItem analogue; // Аналог предмета

  public GenericItem(String name, double price, Category category) {
    this.setID(GenericItem.IDs++);
    this.setName(name);
    this.setPrice(price);
    this.setCategory(category);
  }

  public GenericItem(String name, double price, GenericItem analogue) {
    this.setID(GenericItem.IDs++);
    this.setName(name);
    this.setPrice(price);
    this.setAnalogue(analogue);
  }

  public GenericItem() {
    this.setID(GenericItem.IDs++);
  }

  public void printAll() {
    System.out.printf("ID: %d , Category: %s , Name: %-20s , Price: $%5.2f \n ", getID(),
        getCategory(), getName(),
        getPrice());
  }

  public boolean equals(Object o) {
    if (o instanceof GenericItem) {
      GenericItem geni = (GenericItem) o;

      return (geni.getName().equals(this.getName())) &&
          (geni.getPrice() == this.getPrice()) &&
          (geni.getCategory().equals(this.getCategory()));
    }
    return false;
  }

  public int getID() {
    return ID;
  }

  public void setID(int ID) {
    this.ID = ID;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public double getPrice() {
    return price;
  }

  public void setPrice(double price) {
    this.price = price;
  }

  public Category getCategory() {
    return category;
  }

  public void setCategory(Category category) {
    this.category = category;
  }

  public GenericItem getAnalogue() {
    return analogue;
  }

  public void setAnalogue(GenericItem analogue) {
    this.analogue = analogue;
  }
}