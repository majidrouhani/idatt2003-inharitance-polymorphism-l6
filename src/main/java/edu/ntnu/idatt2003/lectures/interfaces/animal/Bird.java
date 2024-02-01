package edu.ntnu.idatt2003.lectures.interfaces.animal;


/**
 * Represents a bird, which is a type of animal.
 * Birds can walk, fly, and eat.
 * Birds have a name and a number of legs.
 * Birds can be compared based on the number of legs they have.
 */
public class Bird extends Animal implements Comparable<Animal>, Walkable, Flyable, Eatable {
  private final String name;

  public Bird(String name, int noOfLegs) {
    super(noOfLegs);
    this.name = name;
  }

  @Override
  public boolean canEat() {
    return true;
  }

  @Override
  public boolean canFly() {
    return true;
  }

  @Override
  public boolean canWalk() {
    return true;
  }

  public String getName() {
    return name;
  }

  @Override
  public String toString() {
    return "Bird [name=" + name + "]";
  }

  @Override
  public int hashCode() {
    final int prime = 31;
    int result = 1;
    result = prime * result + ((name == null) ? 0 : name.hashCode());
    return result;
  }

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

  @Override
  public int compareTo(Animal a) {
    if (this.getNoOfLegs() == a.getNoOfLegs()) {
      return 1;
    } else {
      return -1;
    }
  }
}