package edu.ntnu.idatt2001.lectures.interfaces.defaultmethod;


public class App {

  /**
   * @param args
   */
  public static void main(final String args[]) {

    Bird bird = new Bird("Owl",2);

    bird.canFly();  //old method
    bird.canFly(bird.getName());  //new method
  }
}
