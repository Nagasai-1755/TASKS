package com.first;

public class Car {
    String color;
    String brand;
    String engineType;
    int bootSpace;
    boolean ac;
    String musicSystem;
    boolean navigationSystem;
    double price;
    String carType;

   public Car(String color, String brand, String engineType, int bootSpace, boolean ac, String musicSystem, boolean navigationSystem, double price, String carType) {
       this.color = color;
       this.brand = brand;
       this.engineType = engineType;
       this.bootSpace = bootSpace;
       this.ac = ac;
       this.musicSystem = musicSystem;
       this.navigationSystem = navigationSystem;
       this.price = price;
       this.carType = carType;
   }


   public void displayInfo() {
       System.out.println("Car Info:\n" +
               "Color: " + color + "\n" +
               "Brand: " + brand + "\n" +
               "Engine Type: " + engineType + "\n" +
               "Boot Space: " + bootSpace + " liters\n" +
               "AC: " + ac + "\n" +
               "Music System: " + musicSystem + "\n" +
               "Navigation System: " + navigationSystem + "\n" +
               "Price: $" + price + "\n" +
               "Car Type: " + carType);
   }

   public static void main(String[] args) {
       Car myCar = new Car("Red", "Toyota", "BS6", 500, true, "Sony", true, 25000, "Sedan");
       myCar.displayInfo();
   }
}