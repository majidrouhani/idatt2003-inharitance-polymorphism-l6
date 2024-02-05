package edu.ntnu.idatt2003.lectures.interfaces.figur;

/**
 * Represents a circle that can be painted.
 */
public class Circle implements Paintable {
  private final String color;
  private final double radius;

  /**
   * Constructs a Circle object with the specified color.
   * 
   * @param color the color of the circle
   */
  public Circle(String color, double radius) {
    this.color = color;
    this.radius = radius;
  }

  /**
   * Returns the color of the circle.
   *
   * @return the color of the circle as a String
   */
  public String getColor() {
    return color;
  }

  /**
   * Returns the radius of the circle.
   *
   * @return the radius of the circle as a double
   */
  public double getRadius() {
    return radius;
  }


  /**
   * Paints the circle.
   */
  @Override
  public void paint() {
    System.out.println("Painting circle..." + color);
  }
}
