package com.company;

public class TechnicalItem extends GenericItem {

  public short warrantyTime; // Гарантийный срок (суток)

  void printAll() {
    super.printAll();
    System.out.printf("Warranty time: %d \n", warrantyTime);
  }
}
