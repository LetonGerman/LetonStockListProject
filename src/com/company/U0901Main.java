package com.company;

public class U0901Main {
  public static void main(String[] args) {

    Integer[] testArr = new Integer[5];
    testArr[0] = 1;
    testArr[1] = 2;
    testArr[2] = 3;
    testArr[3] = 4;
    testArr[4] = 5;

    U0901WorkArray<Integer> testU = new U0901WorkArray<Integer>(testArr);

    System.out.println(testU.sum());
  }
}
