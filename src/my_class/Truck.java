package my_class;

import abstract_class.Car;
import java.util.Calendar;
import java.util.Objects;
import my_enum.Brand;
import my_enum.TypeCar;


public class Truck extends Car {

  private double capacity;

  public Truck(Brand brand, String color, Calendar calendar, double speed,
      double capacity) {
    super(brand, TypeCar.TRUCK, color, calendar, speed);
    this.capacity = capacity;
  }

  @Override
  public void accelerate() {
    double v = 0;
    while (v < getSpeed()) {
      if (v >= 0 && v <= 10) {
        System.out.println("1 передача");
      } else if (v > 10 && v <= 70) {
        System.out.println(("2 передача"));
      } else {
        System.out.println("3 передача");
      }
      v += 3;
    }
  }

  @Override
  public void brake() {
    double v = getSpeed();
    while (v != 0) {
      if (v > 70) {
        System.out.println("3 передача");
      } else if (v > 10 && v <= 70) {
        System.out.println(("2 передача"));
      } else if (v > 0 && v <= 10) {
        System.out.println("1 передача");
        System.out.println("Остановка");
      }
      v -= 3;
    }
  }

  @Override
  public void move() {
    System.out.println("Truck move slowly");
  }

  @Override
  public String toString() {
    return super.toString() + "capacity - " + capacity;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    if (!super.equals(o)) {
      return false;
    }
    Truck truck = (Truck) o;
    return Double.compare(truck.capacity, capacity) == 0;
  }

  @Override
  public int hashCode() {
    return Objects.hash(super.hashCode(), capacity);
  }

  public double getCapacity() {
    return capacity;
  }

  public void setCapacity(double capacity) {
    this.capacity = capacity;
  }
}
