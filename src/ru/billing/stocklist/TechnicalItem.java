package ru.billing.stocklist;

public class TechnicalItem extends GenericItem {

  private short warrantyTime; // Гарантийный срок (суток)

  public void printAll() {
    super.printAll();
    System.out.printf("Warranty time: %d \n", getWarrantyTime());
  }

  public short getWarrantyTime() {
    return warrantyTime;
  }

  public void setWarrantyTime(short warrantyTime) {
    this.warrantyTime = warrantyTime;
  }
}
