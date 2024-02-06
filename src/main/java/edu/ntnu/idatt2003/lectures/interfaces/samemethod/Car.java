package edu.ntnu.idatt2003.lectures.interfaces.samemethod;

import java.util.ArrayList;
import java.util.List;

/**
 * Represents a car.
 */
public class Car {

  List<Passenger> passengers = new ArrayList<Passenger>();

  /**
   * Returns the list of passengers in the car.
   * 
   * @return the list of passengers
   */
  public List<Passenger> getPassengers() {
    return passengers;
  }

  /**
   * Sets the list of passengers in the car.
   * 
   * @param passengers the list of passengers to set
   */
  public void setPassengers(List<Passenger> passengers) {
    this.passengers = passengers;
  }
}
