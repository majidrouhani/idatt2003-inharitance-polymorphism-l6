package edu.ntnu.idatt2003.lectures.interfaces.defaultmethod;

import edu.ntnu.idatt2003.lectures.interfaces.animal.Animal;
import edu.ntnu.idatt2003.lectures.interfaces.animal.Eatable;
import edu.ntnu.idatt2003.lectures.interfaces.animal.Walkable;

/**
 * Represents a bird, which is a type of animal that can walk, fly, and eat.
 * It extends the Animal class and implements the Comparable, Walkable, Flyable, and Eatable interfaces.
 */
public class Bird extends Animal implements Comparable<Animal>, Walkable, Flyable, Eatable {
  private final String name;

  /**
   * Constructs a Bird object with the specified name and number of legs.
   *
   * @param name the name of the bird
   * @param noOfLegs the number of legs the bird has
   */
  public Bird(String name, int noOfLegs) {
    super(noOfLegs);
    this.name = name;
  }

  /**
   * Checks if the bird can eat.
   *
   * @return true if the bird can eat, false otherwise
   */
  @Override
  public boolean canEat() {
    return true;
  }

  /**
   * Checks if the bird can fly.
   *
   * @return true if the bird can fly, false otherwise
   */
  @Override
  public boolean canFly() {
    return true;
  }

  /**
   * Checks if the bird can walk.
   *
   * @return true if the bird can walk, false otherwise
   */
  @Override
  public boolean canWalk() {
    return true;
  }

  /**
   * Gets the name of the bird.
   *
   * @return the name of the bird
   */
  public String getName() {
    return name;
  }

  /**
   * Generates a hash code for the bird.
   *
   * @return the hash code value for the bird
   */
  @Override
  public int hashCode() {
    final int prime = 31;
    int result = 1;
    result = prime * result + ((name == null) ? 0 : name.hashCode());
    return result;
  }

  /**
   * Checks if the bird is equal to another object.
   *
   * @param obj the object to compare with
   * @return true if the bird is equal to the other object, false otherwise
   */
  @Override
  public boolean equals(Object obj) {
    if (this == obj)
      return true;
    if (obj == null)
      return false;
    if (getClass() != obj.getClass())
      return false;
    Bird other = (Bird) obj;
    if (name == null) {
      if (other.name != null)
        return false;
    } else if (!name.equals(other.name))
      return false;
    return true;
  }

  /**
   * Compares the bird to another animal based on the number of legs.
   *
   * @param a the animal to compare with
   * @return a negative integer if this bird has fewer legs than the other animal,
   *         a positive integer if this bird has more legs than the other animal,
   *         or zero if both animals have the same number of legs
   */
  @Override
  public int compareTo(Animal a) {
    if (this.getNoOfLegs() == a.getNoOfLegs()) {
      return 1;
    } else {
      return -1;
    }
  }

  /**
   * Checks if the bird can fly with the specified name.
   *
   * @param name the name of the fly method
   * @return true if the bird can fly, false otherwise
   */
  @Override
  public boolean canFly(String name) {
    System.out.println("New fly-method: " + name);
    return true;
  }
}