package edu.ntnu.idatt2003.lectures.interfaces.figur;

/**
 * Represents a rectangle that can be painted.
 */
public class Rectangle implements Paintable {
  private final String color;
  private final double width;
  private final double height;

  /**
   * Constructs a rectangle with the specified color.
   * 
   * @param color the color of the rectangle
   */
  public Rectangle(String color, double width, double height) {
    this.color = color;
    this.width = width;
    this.height = height;
  }
  
  /**
   * Returns the color of the rectangle.
   *
   * @return the color of the rectangle as a String
   */
  public String getColor() {
    return color;
  }

  /**
   * Returns the width of the rectangle.
   *
   * @return the width of the rectangle as a double
   */
  public double getWidth() {
    return width; 
  }
  
  /**
   * Returns the height of the rectangle.
   *
   * @return the height of the rectangle as a double
   */
  public double getHeight() {
    return height;
  }

  /**
   * Paints the rectangle.
   */
  @Override
  public void paint() {
    System.out.println("Painting rectangle..." + color);
  }
}
