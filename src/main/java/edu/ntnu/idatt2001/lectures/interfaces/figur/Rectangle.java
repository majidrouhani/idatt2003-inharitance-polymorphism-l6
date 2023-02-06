package edu.ntnu.idatt2001.lectures.interfaces.figur;

public class Rectangle implements Paintable {
  private String color;

  public Rectangle(String color) {
    this.color = color;
  }

  @Override
  public void paint() {
    System.out.println("Painting rectangle..." + color);
  }
}
