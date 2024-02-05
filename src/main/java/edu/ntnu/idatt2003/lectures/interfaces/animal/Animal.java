package edu.ntnu.idatt2003.lectures.interfaces.animal;

import java.time.LocalDate;

/**
 * The Animal class represents an abstract animal.
 * It implements the Moveable interface and provides common functionality for all animals.
 */
public abstract class Animal implements Comparable<Animal>, Moveable {
  private final String name;
  private final LocalDate birthDate;
  
  /**
   * Constructs an Animal object with the specified number of legs.
   *
   * @param name the number of legs the animal has
   */
  protected Animal(String name, LocalDate birthDate ) {
    this.name = name;
    this.birthDate = birthDate;
  }

  /**
   * Checks if the animal can move.
   *
   * @return true if the animal can move, false otherwise
   */
  @Override
  public boolean canMove() {
    return true;
  }

  /**
   * Gets the name the animal.
   *
   * @return the name of the animal
   */
  public String getName() {
    return name;
  }

  /**
   * This method would return the age of the animal. All animals age, so this would be a common method.
   * 
   *  @return the age of the animal
   */
  public float getAge() {
    return LocalDate.now().getYear() - birthDate.getYear();
  }

  @Override
  public int compareTo(Animal anotherAnimal) {
    return this.getAge() > anotherAnimal.getAge() ? 1 : -1;
  }
    
}
