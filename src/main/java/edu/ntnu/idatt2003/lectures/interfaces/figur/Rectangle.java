package edu.ntnu.idatt2003.lectures.interfaces.figur;

/**
 * Represents a rectangle that can be painted.
 */
public class Rectangle implements Paintable {
  private String color;

  /**
   * Constructs a rectangle with the specified color.
   * 
   * @param color the color of the rectangle
   */
  public Rectangle(String color) {
    this.color = color;
  }

  /**
   * Paints the rectangle.
   */
  @Override
  public void paint() {
    System.out.println("Painting rectangle..." + color);
  }
}
