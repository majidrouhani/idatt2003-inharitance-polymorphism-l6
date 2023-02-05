package edu.ntnu.idatt2001.lectures.interfaces.animal;

import java.util.logging.Level;
import java.util.logging.Logger;

public class App {
  private static final Logger log = Logger.getLogger(App.class.getName());
  private static final String  SAME_NO_LEGS= "Same number of legs";
  private static final String  DIFF_NO_LEGS= "Same number of legs";

  public static void main(String args[]) {
    String msg = "";

    Cat cat = new Cat("Luna",4);
    Dog dog = new Dog("Prince",4);
    Bird bird = new Bird("Silkie Rooster",2);
    Fish fish = new Fish("salmon");
    Exocoetidae flyingFish = new Exocoetidae("exocoetidae");

    msg = "Comparing dog and cat: "+(dog.compareTo(cat) > 0 ? SAME_NO_LEGS : DIFF_NO_LEGS);
    log.log(Level.INFO, "{0}", msg);

    msg = "Comparing dog and bird: "+(dog.compareTo(bird) > 0 ? SAME_NO_LEGS : DIFF_NO_LEGS);
    log.log(Level.INFO, "{0}", msg);

    msg = "Comparing fish and bird: "+(fish.compareTo(bird) > 0 ? SAME_NO_LEGS : DIFF_NO_LEGS);
    log.log(Level.INFO, "{0}", msg);

    msg = "Comparing flyingFish and bird: "+(flyingFish.compareTo(bird) > 0 ? SAME_NO_LEGS : DIFF_NO_LEGS);
    log.log(Level.INFO, "{0}", msg);

    Cat myCat = new Cat("Luna",4);

    if (myCat.equals(cat)) {
      log.log(Level.INFO, "{0}", "This is my cat!");
    }

    log.log(Level.INFO, "{0}", flyingFish.canFly());
  }
}
