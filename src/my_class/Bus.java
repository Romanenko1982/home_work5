package my_class;

import abstract_class.Car;
import java.util.Calendar;
import java.util.Objects;
import my_enum.Brand;
import my_enum.TypeCar;


public class Bus extends Car {


  private int countSeatPlace;


  public Bus(Brand brand, String color, Calendar calendar, double speed,
      int countSeatPlace) {
    super(brand, TypeCar.BUS, color, calendar, speed);
    this.countSeatPlace = countSeatPlace;
  }

  public String cases(int countSeatPlace) {
    if ((countSeatPlace > 4 && countSeatPlace < 21) || (countSeatPlace % 10 > 4
        && countSeatPlace % 10 < 21)) {
      return " пассажиров";
    } else if (countSeatPlace % 10 == 1) {
      return " пассажир";
    } else {
      return " пассажира";
    }
  }

  public void countStandPassenger() {
    double fullness;
    if (countSeatPlace < 15) {
      fullness = 0.5;
    } else if (countSeatPlace > 15 && countSeatPlace < 26) {
      fullness = 1.5;
    } else {
      fullness = 3.6;
    }
    int countStandPassenger = (int) Math.abs(Math.round(countSeatPlace * (fullness - 1)));
    int total = countSeatPlace + countStandPassenger;
    System.out.println(" Число с учетом стоячих мест расчитано на " + total + cases(total));
  }

  @Override
  public void accelerate() {
    System.out.println("Сильно не гоню, т.к. вожу людей");
  }

  @Override
  public void brake() {
    System.out.println("Торможу аккуратно, но уверенно");

  }


  public void move() {
    System.out.println("Bus move with music");
  }

  public void move(int passenger) {
    if (passenger > 0) {
      System.out.println("Автобус едет по расписанию");
    } else {
      System.out.println("Автобус едет в парк");
    }
  }


  @Override
  public String toString() {
    StringBuilder str = new StringBuilder(super.toString());
    str.append(" countSeatPlace - ").append(countSeatPlace).append(cases(countSeatPlace));
    return str.toString();
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || o.getClass() != this.getClass()) {
      return false;
    }

    if (!super.equals(o)) {
      return false;
    }
    Bus bus = (Bus) o;
    return countSeatPlace == bus.countSeatPlace;
  }

  @Override
  public int hashCode() {
    return Objects.hash(super.hashCode(), countSeatPlace);
  }

  public int getCountSeatPlace() {
    return countSeatPlace;
  }

  public void setCountSeatPlace(int countSeatPlace) {
    this.countSeatPlace = countSeatPlace;
  }
}
