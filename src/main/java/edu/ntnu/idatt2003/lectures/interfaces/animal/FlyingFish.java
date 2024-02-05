package edu.ntnu.idatt2003.lectures.interfaces.animal;

import java.time.LocalDate;

/**
 * Represents a specific type of fish called Flying fish.
 * Flying fish can fly and inherit properties from the Fish class.
 */
public class FlyingFish extends Fish implements Flyable {

  private final double finSize;

  public double getFinSize() {
    return finSize;
  }

  /**
   * Constructs a new Flying fish object with the given name.
   *
   * @param name the name of the Flying fish
   */
  public FlyingFish(String name, LocalDate birthDate, String waterType, double finSize) {
    super(name, birthDate, waterType);
    this.finSize = finSize;
  }

  /**
   * Checks if the Flying fish can fly.
   *
   * @return true if the Flying fish can fly, false otherwise
   */
  @Override
  public boolean canFly() {
    return true;
  }


  
  @Override
  public int hashCode() {
    final int prime = 31;
    int result = super.hashCode();
    long temp;
    temp = Double.doubleToLongBits(finSize);
    result = prime * result + (int) (temp ^ (temp >>> 32));
    return result;
  }

  @Override
  public boolean equals(Object obj) {
    if (this == obj)
      return true;
    if (!super.equals(obj))
      return false;
    if (getClass() != obj.getClass())
      return false;
    FlyingFish other = (FlyingFish) obj;
    if (Double.doubleToLongBits(finSize) != Double.doubleToLongBits(other.finSize))
      return false;
    return true;
  }

  @Override
  public String toString() {
    return "Flying fish{" +
        "finSize=" + finSize +
        '}';
  }
}