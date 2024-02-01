package edu.ntnu.idatt2003.lectures.interfaces.defaultmethod;


public class App {

  /**
   * @param args
   */
  /**
   * The main method is the entry point of the application.
   * It creates a Bird object and calls the canFly methods.
   *
   * @param args The command-line arguments passed to the program.
   */
  public static void main(String[] args) {

    Bird bird = new Bird("Owl",2);

    bird.canFly();  //old method
    bird.canFly(bird.getName());  //new method
  }
}
