package edu.ntnu.idatt2003.lectures.interfaces.samemethod;

import java.io.PrintStream;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.List;

public class App {

  /**
   * @param args
   * @throws UnsupportedEncodingException 
   */
  public static void main(final String[] args) throws UnsupportedEncodingException {
    final Car car = new Car();

    List<Passenger> passengers = new ArrayList<Passenger>();

    passengers.add(new Passenger("Smussforfatter Inco Gnito", "M"));
    passengers.add(new Passenger("Patolog Rigmor Mortis", "F"));
    passengers.add(new Passenger("Syngedame Nanna Na", "F"));
    passengers.add(new Passenger("Befal A. Sap", "M"));
    passengers.add(new Passenger("Tigergutt", "M", "Smussforfatter"));
    passengers.add(new Passenger("Pus", "F", "Naboen"));

    car.setPassengers(passengers);

    for (Passenger passenger : passengers) {
      System.out.println(passenger);
    }
  }

}
