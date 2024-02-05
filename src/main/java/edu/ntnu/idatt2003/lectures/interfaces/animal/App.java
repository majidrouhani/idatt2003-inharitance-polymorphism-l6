package edu.ntnu.idatt2003.lectures.interfaces.animal;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.logging.Logger;

/**
 * The App class represents the main entry point of the program.
 * It contains the main method and demonstrates the usage of animal classes.
 */
public class App {
  private static final Logger log = Logger.getLogger(App.class.getName());

  public static void main(String args[]) {
    List<Animal> animals = new ArrayList<>();
    animals.add(new Cat("Misty", LocalDate.of(2015, 5, 15), 9));
    animals.add(new Dog("Buddy", LocalDate.of(2018, 8, 20), "Golden Retriever"));
    animals.add(new Bird("parrot", LocalDate.of(2019, 10, 1), 2));
    animals.add(new Fish("Clownfish", LocalDate.of(2019, 10, 1), "Salt water"));
    animals.add(new Fish("Goldfish", LocalDate.of(2010, 11, 10), "Fresh water"));
    animals.add(new FlyingFish("Atlantic", LocalDate.of(2019, 10, 1), "Salt water", 2.5));

    // Print the animals
    for (Animal animal : animals) {
      log.info(animal.toString());
    }

    // Sort the animals based on their age
    Collections.sort(animals);
    for (Animal animal : animals) {
      log.info(animal.toString());
    }

  }
}
