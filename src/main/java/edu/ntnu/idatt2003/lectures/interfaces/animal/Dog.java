package edu.ntnu.idatt2003.lectures.interfaces.animal;


/**
 * Represents a Dog, which is a type of Animal.
 * Dogs can eat and walk.
 * Dogs can be compared based on the number of legs they have.
 */
public class Dog extends Animal implements Comparable<Animal>, Walkable, Eatable {
  private final String name;

  /**
   * Constructs a Dog object with the given name and number of legs.
   *
   * @param name      the name of the dog
   * @param noOfLegs  the number of legs the dog has
   */
  public Dog(String name, int noOfLegs) {
    super(noOfLegs);
    this.name = name;
  }

  /**
   * Checks if the dog can eat.
   *
   * @return true if the dog can eat, false otherwise
   */
  @Override
  public boolean canEat() {
    return true;
  }

  /**
   * Checks if the dog can walk.
   *
   * @return true if the dog can walk, false otherwise
   */
  @Override
  public boolean canWalk() {
    return true;
  }

  /**
   * Gets the name of the dog.
   *
   * @return the name of the dog
   */
  public String getName() {
    return name;
  }

  /**
   * Returns a string representation of the dog.
   *
   * @return a string representation of the dog
   */
  @Override
  public String toString() {
    return "Dog [name=" + name + "]";
  }

  /**
   * Generates a hash code for the dog.
   *
   * @return the hash code value for the dog
   */
  @Override
  public int hashCode() {
    final int prime = 31;
    int result = 1;
    result = prime * result + ((name == null) ? 0 : name.hashCode());
    return result;
  }

  /**
   * Checks if the dog is equal to another object.
   *
   * @param obj the object to compare with
   * @return true if the dog is equal to the other object, false otherwise
   */
  @Override
  public boolean equals(Object obj) {
    if (this == obj)
      return true;
    if (obj == null)
      return false;
    if (getClass() != obj.getClass())
      return false;
    Dog other = (Dog) obj;
    if (name == null) {
      if (other.name != null)
        return false;
    } else if (!name.equals(other.name))
      return false;
    return true;
  }

  /**
   * Compares the dog to another animal based on the number of legs they have.
   *
   * @param a the animal to compare with
   * @return a negative integer if this dog has fewer legs than the other animal,
   *         a positive integer if this dog has more legs than the other animal,
   *         or zero if they have the same number of legs
   */
  @Override
  public int compareTo(Animal a) {
    if (this.getNoOfLegs() == a.getNoOfLegs()) {
      return 1;
    } else {
      return -1;
    }
  }
}