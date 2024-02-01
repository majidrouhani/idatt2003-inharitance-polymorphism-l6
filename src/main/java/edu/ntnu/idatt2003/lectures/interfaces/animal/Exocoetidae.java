package edu.ntnu.idatt2003.lectures.interfaces.animal;


/**
 * Represents a specific type of fish called Exocoetidae.
 * Exocoetidae can fly and inherit properties from the Fish class.
 */
public class Exocoetidae extends Fish implements Flyable {

  /**
   * Constructs a new Exocoetidae object with the given name.
   *
   * @param name the name of the Exocoetidae
   */
  public Exocoetidae(String name) {
    super(name);
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

  /**
   * Compares the Exocoetidae with another Animal object based on the number of legs.
   *
   * @param a the Animal object to compare with
   * @return a positive integer if the Exocoetidae has more legs, a negative integer if the Exocoetidae has fewer legs,
   *         or 0 if they have the same number of legs
   */
  @Override
  public int compareTo(Animal a) {
    if (a.getNoOfLegs() == 0) {
      return 1;
    } else {
      return -1;
    }
  }
}