package edu.ntnu.idatt2003.lectures.interfaces.animal;


/**
 * Represents a Cat, which is a type of Animal.
 * Implements the Comparable interface with Animal as the generic type.
 * Implements the Walkable and Eatable interfaces.
 */
public class Cat extends Animal implements Comparable<Animal>, Walkable, Eatable {
  private final String name;

  /**
   * Constructs a Cat object with the specified name and number of legs.
   * 
   * @param name      the name of the cat
   * @param noOfLegs  the number of legs the cat has
   */
  public Cat(String name, int noOfLegs) {
    super(noOfLegs);
    this.name = name;
  }

  /**
   * Checks if the cat can eat.
   * 
   * @return true if the cat can eat, false otherwise
   */
  @Override
  public boolean canEat() {
    return true;
  }

  /**
   * Checks if the cat can walk.
   * 
   * @return true if the cat can walk, false otherwise
   */
  @Override
  public boolean canWalk() {
    return true;
  }

  /**
   * Gets the name of the cat.
   * 
   * @return the name of the cat
   */
  public String getName() {
    return name;
  }

  /**
   * Returns a string representation of the cat.
   * 
   * @return a string representation of the cat
   */
  @Override
  public String toString() {
    return "Cat [name=" + name + "]";
  }

  /**
   * Generates a hash code for the cat.
   * 
   * @return the hash code value for the cat
   */
  @Override
  public int hashCode() {
    final int prime = 31;
    int result = 1;
    result = prime * result + ((name == null) ? 0 : name.hashCode());
    return result;
  }

  /**
   * Checks if the cat is equal to another object.
   * 
   * @param obj  the object to compare with
   * @return true if the cat is equal to the other object, false otherwise
   */
  @Override
  public boolean equals(Object obj) {
    if (this == obj)
      return true;
    if (obj == null)
      return false;
    if (getClass() != obj.getClass())
      return false;
    Cat other = (Cat) obj;
    if (name == null) {
      if (other.name != null)
        return false;
    } else if (!name.equals(other.name))
      return false;
    return true;
  }

  /**
   * Compares the cat to another animal based on the number of legs.
   * 
   * @param a  the animal to compare with
   * @return 1 if the cat has the same number of legs as the other animal, -1 otherwise
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