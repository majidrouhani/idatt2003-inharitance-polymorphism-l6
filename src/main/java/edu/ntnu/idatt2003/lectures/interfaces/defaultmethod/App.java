package edu.ntnu.idatt2003.lectures.interfaces.defaultmethod;

import java.time.LocalDate;

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

    Bird parrot = new Bird("parrot", LocalDate.of(2019, 10, 1), 2);

    parrot.canFly();  //old method
    parrot.canFly(parrot.getName());  //new method
  }
}
