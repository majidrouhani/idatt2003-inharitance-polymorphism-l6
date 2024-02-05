package edu.ntnu.idatt2003.lectures.interfaces.animal;

import java.time.LocalDate;

/**
 * Represents a fish.
 * Inherits from the Animal class and implements the Comparable, Swimable, and Eatable interfaces.
 */
public class Fish extends Animal implements Comparable<Animal>, Swimable, Eatable {
  private final String waterType;

  public String getWaterType() {
    return waterType;
  }

  public Fish(String name, LocalDate birthDate, String waterType) {
    super(name, birthDate);
    this.waterType = waterType;
  }

  @Override
  public boolean canEat() {
    return true;
  }

  @Override
  public boolean canSwim() {
    return true;
  }


  
  @Override
  public int hashCode() {
    final int prime = 31;
    int result = 1;
    result = prime * result + ((waterType == null) ? 0 : waterType.hashCode());
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
    Fish other = (Fish) obj;
    if (waterType == null) {
      if (other.waterType != null)
        return false;
    } else if (!waterType.equals(other.waterType))
      return false;
    return true;
  }

  @Override
  public int compareTo(Animal anotherAnimal) {
    if (anotherAnimal instanceof Fish) {
      Fish anotherDog = (Fish) anotherAnimal;

      int result = this.waterType.compareTo(anotherDog.getWaterType());

      if (result < 0) {
        return -1;
      } else if (result > 0) {
        return 1;
      } else {
        return 0;
      }

    }
    return 0;
  }

  @Override
  public String toString() {
    return "Fish{" +
      "name='" + getName() + '\'' +
      ", age=" + super.getAge() +
      ", waterType='" + waterType + '\'' +
      '}';
  }
}