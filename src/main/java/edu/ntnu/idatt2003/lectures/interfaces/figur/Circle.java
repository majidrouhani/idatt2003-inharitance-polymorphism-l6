package edu.ntnu.idatt2003.lectures.interfaces.figur;

/**
 * Represents a circle that can be painted.
 */
public class Circle implements Paintable {
  private String color;

  /**
   * Constructs a Circle object with the specified color.
   * 
   * @param color the color of the circle
   */
  public Circle(String color) {
    this.color = color;
  }

  /**
   * Paints the circle.
   */
  @Override
  public void paint() {
    System.out.println("Painting circle..." + color);
  }
}
