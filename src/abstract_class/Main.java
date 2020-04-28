package abstract_class;

import java.util.Calendar;
import java.util.GregorianCalendar;
import my_class.Bus;
import my_class.Man;
import my_class.Passenger;
import my_class.Truck;
import my_enum.Brand;
import my_enum.Sport;


public class Main {

  public static void main(String[] args) {
    Passenger car1 = new Passenger(Brand.MERCEDES, "Black",
        new GregorianCalendar(1980, Calendar.MARCH, 12), 130, 10.4);
    Passenger car2 = new Passenger(Brand.VOLVO, "White",
        new GregorianCalendar(1980, Calendar.MARCH, 12), 150, 12.4);
    Bus car3 = new Bus(Brand.MERCEDES, "Red", new GregorianCalendar(1980, Calendar.MARCH, 12), 100,
        12);
    Bus car4 = new Bus(Brand.VOLVO, "Red", new GregorianCalendar(1980, Calendar.MARCH, 07), 110,
        22);
    Truck car5 = new Truck(Brand.MERCEDES, "Red", new GregorianCalendar(1980, Calendar.MARCH, 12),
        80, 20.0);
    Truck car6 = new Truck(Brand.VOLVO, "Grey", new GregorianCalendar(1980, Calendar.MARCH, 12), 90,
        15.0);
    Man man = new Man("Golubkov", "Lenia", 40, Sport.RUN, "actor");
    System.out.println();
  }
}
