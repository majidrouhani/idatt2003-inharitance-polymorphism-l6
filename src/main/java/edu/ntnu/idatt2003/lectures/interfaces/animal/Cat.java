package edu.ntnu.idatt2003.lectures.interfaces.animal;

import java.time.LocalDate;

/**
 * Represents a Cat, which is a type of Animal.
 * Implements the Comparable interface with Animal as the generic type.
 * Implements the Walkable and Eatable interfaces.
 */
public class Cat extends Animal implements Comparable<Animal>, Walkable, Eatable {
  private final int numberOfLives;

  public int getNumberOfLives() {
    return numberOfLives;
  }

  /**
   * Constructs a Cat object with the specified name and number of legs.
   * 
   * @param name      the name of the cat
   * @param noOfLegs  the number of legs the cat has
   */
  public Cat(String name, LocalDate birthDate, int numberOfLives) {
    super(name, birthDate);
    this.numberOfLives = numberOfLives;
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
   * Compares the cat to another animal based on the number of legs.
   * 
   * @param a  the animal to compare with
   * @return 1 if the cat has the same number of legs as the other animal, -1 otherwise
   */
  @Override
  public int compareTo(Animal anotherAnimal) {
    if (anotherAnimal instanceof Cat) {
      Cat anotherCat = (Cat) anotherAnimal;
      if (this.getNumberOfLives() == anotherCat.getNumberOfLives()) {
        return 0;
      } else if (this.getNumberOfLives() > anotherCat.getNumberOfLives()) {
        return 1;
      } else {
        return -1;
      }
    }
    return 0;
  }

  @Override
  public String toString() {
    return "Cat{" +
      "name='" + getName() + '\'' +
      ", age=" + super.getAge() +
      ", numberOfLives=" + numberOfLives +
      '}';
  }
}