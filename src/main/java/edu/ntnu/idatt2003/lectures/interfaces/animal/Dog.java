package edu.ntnu.idatt2003.lectures.interfaces.animal;

import java.time.LocalDate;

/**
 * Represents a Dog, which is a type of Animal.
 * Dogs can eat and walk.
 * Dogs can be compared based on the number of legs they have.
 */
public class Dog extends Animal implements Walkable, Eatable {
  private final String breed;

  public String getBreed() {
    return breed;
  }

  /**
   * Constructs a Dog object with the given name and number of legs.
   *
   * @param name     the name of the dog
   * @param noOfLegs the number of legs the dog has
   */
  public Dog(String name, LocalDate birthDate, String breed) {
    super(name, birthDate);
    this.breed = breed;
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

  @Override
  public int hashCode() {
    final int prime = 31;
    int result = 1;
    result = prime * result + ((breed == null) ? 0 : breed.hashCode());
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
    Dog other = (Dog) obj;
    if (breed == null) {
      if (other.breed != null)
        return false;
    } else if (!breed.equals(other.breed))
      return false;
    return true;
  }

  @Override
  public String toString() {
    return "Dog [name=" + getName() + ", breed=" + breed + "]";
  }
}