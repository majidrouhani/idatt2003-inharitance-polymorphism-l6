package edu.ntnu.idatt2003.lectures.interfaces.constructor;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * The App class represents the main entry point of the program.
 * It contains the main method that initializes a Figur object and logs its information.
 */
public class App {
  private static final Logger log = Logger.getLogger(App.class.getName());

  public static void main(String[] args) {
    Figur f = new Figur("Red") {

      @Override
      public double beregnAreal() {
        return 20;
      }
    };

    log.log(Level.INFO, "{0}", f);    
  }
}
