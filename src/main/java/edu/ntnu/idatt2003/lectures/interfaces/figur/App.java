package edu.ntnu.idatt2003.lectures.interfaces.figur;

public class App {

  /**
   * The main method is the entry point of the application.
   * It creates a Painter object, adds various shapes to it,
   * and then calls the paintAllObjects method to paint all the shapes.
   *
   * @param args The command line arguments.
   */
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
