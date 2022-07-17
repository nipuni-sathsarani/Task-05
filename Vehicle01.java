package FP_Experiments;

import java.util.Arrays;
import java.util.List;

public class Vehicle01 {
  public static void main(String[] args) {
    List<Vehicle> table = Arrays.asList(
        new Vehicle(1,"Red","Toyota", 100),
        new Vehicle(2,"Blue", "Mitsubishi", 150),
        new Vehicle(3,"Yellow", "Volvo", 240),
        new Vehicle(4,"Green", "BMW", 50),
        new Vehicle(5,"Ash", "Suzuki", 180),
        new Vehicle(6,"White", "Mazda",100),
        new Vehicle(7,"Light Rose", "Nissan",140),
        new Vehicle(8,"Light Blue", "Honda", 180),
        new Vehicle(9,"Light Green", "Volkswagen", 20),
        new Vehicle(10,"Black", "Ford",60));

    table.forEach(x -> System.out.println(x));    

  }
}
