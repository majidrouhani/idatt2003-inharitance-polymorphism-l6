package edu.ntnu.idatt2003.lectures.interfaces.animal;

import java.time.LocalDate;

/**
 * Represents a specific type of fish called Exocoetidae.
 * Exocoetidae can fly and inherit properties from the Fish class.
 */
public class Exocoetidae extends Fish implements Flyable {

  private final double finSize;

  public double getFinSize() {
    return finSize;
  }

  /**
   * Constructs a new Exocoetidae object with the given name.
   *
   * @param name the name of the Exocoetidae
   */
  public Exocoetidae(String name, LocalDate birthDate, String waterType, double finSize) {
    super(name, birthDate, waterType);
    this.finSize = finSize;
  }

  /**
   * Checks if the Exocoetidae can fly.
   *
   * @return true if the Exocoetidae can fly, false otherwise
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
    Exocoetidae other = (Exocoetidae) obj;
    if (Double.doubleToLongBits(finSize) != Double.doubleToLongBits(other.finSize))
      return false;
    return true;
  }

  /**
   * Compares the Exocoetidae with another Animal object based on the number of legs.
   *
   * @param a the Animal object to compare with
   * @return a positive integer if the Exocoetidae has more legs, a negative integer if the Exocoetidae has fewer legs,
   *         or 0 if they have the same number of legs
   */
  @Override
  public int compareTo(Animal anotherAnimal) {
    if (anotherAnimal instanceof Exocoetidae) {
      Exocoetidae anotherExocoetidae = (Exocoetidae) anotherAnimal;

      
      if (this.finSize < anotherExocoetidae.getFinSize()) {
        return -1;
      } else if (this.finSize > anotherExocoetidae.getFinSize()) {
        return 1;
      } else {
        return 0;
      }

    }
    return 0;
  }

  @Override
  public String toString() {
    return "Exocoetidae{" +
        "finSize=" + finSize +
        '}';
  }
}