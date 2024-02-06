package edu.ntnu.idatt2003.lectures.interfaces.samemethod.abstraction;

import java.util.ArrayList;
import java.util.List;

/**
 * Represents a car.
 */
public class Car {

  List<Passenger> passengers = new ArrayList<Passenger>();

  /**
   * Gets the list of passengers in the car.
   * @return The list of passengers.
   */
  public List<Passenger> getPassengers() {
    return passengers;
  }

  /**
   * Sets the list of passengers in the car.
   * @param passengers The list of passengers.
   */
  public void setPassengers(List<Passenger> passengers) {
    this.passengers = passengers;
  }
}
