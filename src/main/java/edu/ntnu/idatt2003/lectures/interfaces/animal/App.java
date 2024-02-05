package edu.ntnu.idatt2003.lectures.interfaces.animal;

import java.time.LocalDate;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * The App class represents the main entry point of the program.
 * It contains the main method and demonstrates the usage of animal classes.
 */
public class App {
  private static final Logger log = Logger.getLogger(App.class.getName());

  public static void main(String args[]) {
    List<Animal> animals = List.of(
      new Cat("Misty", LocalDate.of(2015, 5, 15), 9),
      new Dog("Buddy", LocalDate.of(2018, 8, 20), "Golden Retriever"),
      new Bird("parrot", LocalDate.of(2019, 10, 1), 2),
      new Fish("fish", LocalDate.of(2019, 10, 1), "saltwater"),
      new Exocoetidae("flyingFish", LocalDate.of(2019, 10, 1), "saltwater", 2.5)
    );


    for (Animal animal : animals) {
      log.log(Level.INFO, "{0}", animal);
    }

  }
}
