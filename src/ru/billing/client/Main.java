package ru.billing.client;

import ru.billing.stocklist.Category;
import ru.billing.stocklist.FoodItem;
import ru.billing.stocklist.GenericItem;
import ru.billing.stocklist.ItemCatalog;
import ru.billing.stocklist.TechnicalItem;
import java.util.Calendar;
import java.util.Date;

public class Main {

  public static void main(String[] args) {

    String line = "Конфеты 'Маска'; 45; 120";
    String[] itemfld;
    itemfld = new String[3];

    GenericItem item1 = new GenericItem();
    item1.setID(++GenericItem.IDs);
    item1.setName("Steins;Gate");
    item1.setPrice(30.01);
    item1.setCategory(Category.GAME);

    GenericItem item2 = new GenericItem();
    item2.setID(++GenericItem.IDs);
    item2.setName("Mass Effect");
    item2.setPrice(59.99);
    item2.setCategory(Category.GAME);

    GenericItem item3 = new GenericItem();
    item3.setID(++GenericItem.IDs);
    item3.setName("ChronoClock");
    item3.setPrice(6.76);
    item3.setCategory(Category.GAME);

    GenericItem item4 = new GenericItem();
    item4.setID(++GenericItem.IDs);
    item4.setName("FIFA");
    item4.setPrice(3.33);
    item4.setCategory(Category.GAME);

    GenericItem item5 = new GenericItem();
    item5.setID(++GenericItem.IDs);
    item5.setName("Anthem");
    item5.setPrice(50.00);
    item5.setCategory(Category.GAME);

    GenericItem item6 = new GenericItem();
    item6.setID(++GenericItem.IDs);
    item6.setName("DOKA 2");
    item6.setPrice(69.69);
    item6.setCategory(Category.GAME);

    GenericItem item7 = new GenericItem();
    item7.setID(++GenericItem.IDs);
    item7.setName("GTA");
    item7.setPrice(300.00);
    item7.setCategory(Category.GAME);

    GenericItem item8 = new GenericItem();
    item8.setID(++GenericItem.IDs);
    item8.setName("GRIS");
    item8.setPrice(20.19);
    item8.setCategory(Category.GAME);

    GenericItem item9 = new GenericItem();
    item9.setID(++GenericItem.IDs);
    item9.setName("Hyper Light Drifter");
    item9.setPrice(25.52);
    item9.setCategory(Category.GAME);

    GenericItem item10 = new GenericItem();
    item10.setID(++GenericItem.IDs);
    item10.setName("Age of Empires");
    item10.setPrice(37.92);
    item10.setCategory(Category.GAME);

    FoodItem cake = new FoodItem();
    cake.setID(++GenericItem.IDs);
    cake.setName("Napoleon");
    cake.setPrice(9999.99);
    cake.setCategory(Category.FOOD);
    cake.setDateOfIncome(Calendar.getInstance());
    cake.getDateOfIncome().set(2018, Calendar.DECEMBER, 28);
    cake.setExpires((short)5);

    TechnicalItem glider = new TechnicalItem();
    glider.setID(++GenericItem.IDs);
    glider.setName("Water Glider");
    glider.setPrice(349.49);
    glider.setWarrantyTime((short)365);

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

    itemfld = line.split(";");
    for (String s : itemfld) {
      System.out.println(s);
    }

    FoodItem candy = new FoodItem(itemfld[0], Double.valueOf(itemfld[1].trim()),
        Short.valueOf(itemfld[2].trim()));
    candy.printAll();

    ItemCatalog cat = new ItemCatalog();
    cat.addItem(item1);
    cat.addItem(item2);
    cat.addItem(item3);
    cat.addItem(item4);
    cat.addItem(item5);
    cat.addItem(item6);
    cat.addItem(item7);
    cat.addItem(item8);
    cat.addItem(item9);
    cat.addItem(item10);

    long begin = new Date().getTime();

    for(int i=0; i<100000;i++) {
      cat.findItemByID(8);
    }
    long end = new Date().getTime();
    System.out.println("In HashMap: "+(end-begin));
    begin = new Date().getTime();
    for(int i=0; i<100000;i++) {
      cat.findItemByIDAL(8);
    }
    end = new Date().getTime();
    System.out.println("In ArrayList: "+(end-begin));

    CatalogLoader loader = new CatalogStubLoader();
    loader.load(cat);
    cat.printItems();
  }
}
