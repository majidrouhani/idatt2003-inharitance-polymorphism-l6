package edu.ntnu.idatt2001.lectures.interfaces.figur;

public class App {

  public static void main(String[] args) {
    Painter painter = new Painter();

    painter.add(new Rectangle("Green"));
    painter.add(new Rectangle("Red"));
    painter.add(new Circle("Blue"));
    painter.add(new Circle("Yellow"));
    painter.add(new Circle("Black"));

    painter.paintAllObjects();
  }
}
