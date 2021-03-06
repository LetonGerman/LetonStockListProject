package com.company;

public class GenericItem {

  static int IDs = 0; // ID товара

  public int ID; // ID товара
  public String name; // Наименование товара
  public double price; // Цена товара
  public Category category = Category.GENERAL;
  public GenericItem analogue; // Аналог предмета

  void printAll() {
    System.out.printf("ID: %d , Category: %s , Name: %-20s , Price: $%5.2f \n ", ID, category, name,
        price);
  }

  public boolean equals(Object o) {
    if (o instanceof GenericItem) {
      GenericItem geni = (GenericItem) o;

      return (geni.name.equals(this.name)) &&
          (geni.price == this.price) &&
          (geni.category.equals(this.category));
    }
    return false;
  }
}