package com.company;

public class U0901WorkArray<T extends Number> {
  T[] arrNums;

  public U0901WorkArray(T[] numP) {
    this.arrNums = numP;
  }

  public double sum() {
    double doubleWork = 0;

    for(T number : arrNums) {
      doubleWork += number.doubleValue();
    }
    return doubleWork;
  }
}
