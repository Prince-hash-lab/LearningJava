package javacollections;

import java.util.ArrayList;
import java.util.Collections;
public class arraylistjava {
  public static void main(String[] args) {
    ArrayList<String> cars = new ArrayList<String>();
    cars.add("Volvo");
    cars.add("BMW");
    cars.add("Ford");
    cars.add("Mazda");
    Collections.sort(cars); // Sort
    System.out.println(cars);
  }
}