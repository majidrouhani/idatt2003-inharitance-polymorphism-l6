package edu.ntnu.idatt2003.lectures.interfaces.animal;

import java.time.LocalDate;

/**
 * Represents a bird, which is a type of animal.
 * Birds can walk, fly, and eat.
 * Birds have a name and a number of legs.
 * Birds can be compared based on the number of legs they have.
 */
public class Bird extends Animal implements Walkable, Flyable, Eatable {
  private final double wingSpan;

  public Bird(String name, LocalDate birthDate, double winSpan) {
    super(name, birthDate);
    this.wingSpan = winSpan;
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

  public double getWingSpan() {
    return this.wingSpan;
  }

  @Override
  public int hashCode() {
    final int prime = 31;
    int result = 1;
    long temp;
    temp = Double.doubleToLongBits(wingSpan);
    result = prime * result + (int) (temp ^ (temp >>> 32));
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
    if (Double.doubleToLongBits(wingSpan) != Double.doubleToLongBits(other.wingSpan))
      return false;
    return true;
  }

  @Override
  public String toString() {
    return "Bird [wingSpan=" + wingSpan + ", name=" + super.getName() + ", age=" + super.getAge() + "]";
  }
}