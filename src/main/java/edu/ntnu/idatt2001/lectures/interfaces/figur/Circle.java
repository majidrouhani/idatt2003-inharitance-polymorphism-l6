package edu.ntnu.idatt2001.lectures.interfaces.figur;

public class Circle implements Paintable {
  private String color;

  public Circle(String color) {
    this.color = color;
  }

  @Override
  public void paint() {
    System.out.println("Painting circle..." + color);
  }

}
