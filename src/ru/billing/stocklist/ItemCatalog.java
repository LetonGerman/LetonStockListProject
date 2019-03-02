package ru.billing.stocklist;

import java.util.ArrayList;
import java.util.HashMap;

public class ItemCatalog {
  private HashMap<Integer, GenericItem> catalog = new HashMap<Integer, GenericItem>();
  private ArrayList<GenericItem> ALCatalog = new ArrayList<GenericItem>();

  public void addItem(GenericItem item) {
    getCatalog().put(item.getID(), item);
    getALCatalog().add(item);
  }

  public void printItems() {
    for (GenericItem i : getALCatalog()) {
      System.out.println(i.toString());
    }
  }

  public GenericItem findItemByID(int id) {
    if(!getCatalog().containsKey(id)) {
      return null;
    } else {
      return getCatalog().get(id);
    }
  }

  public GenericItem findItemByIDAL(int id) {
    for (GenericItem i : getALCatalog()) {
      if(i.getID() == id) {
        return i;
      }
    }
    return null;
  }

  public HashMap<Integer, GenericItem> getCatalog() {
    return catalog;
  }

  public void setCatalog(HashMap<Integer, GenericItem> catalog) {
    this.catalog = catalog;
  }

  public ArrayList<GenericItem> getALCatalog() {
    return ALCatalog;
  }

  public void setALCatalog(ArrayList<GenericItem> ALCatalog) {
    this.ALCatalog = ALCatalog;
  }
}
