package edu.ntnu.idatt2003.lectures.interfaces.constructor;

/**
 * The abstract class Figur represents a geometric figure.
 * It provides a common interface for subclasses to implement
 * and defines common properties and behaviors for all figures.
 */
public abstract class Figur {
  private final String color;

  /**
   * Constructs a new Figur object with the specified color.
   * 
   * @param color the color of the figure
   */
  Figur(String color) {
    this.color = color;
  }

  /**
   * Returns the color of the figure.
   * 
   * @return the color of the figure
   */
  public String getColor() {
    return color;
  }

  /**
   * Calculates and returns the area of the figure.
   * 
   * @return the area of the figure
   */
  public abstract double beregnAreal();

  /**
   * Returns a string representation of the figure.
   * 
   * @return a string representation of the figure
   */
  @Override
  public String toString() {
    return "Figur [getColor()=" + getColor() + ", beregnAreal()=" + beregnAreal() + "]";
  }
}
