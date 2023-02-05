package edu.ntnu.idatt2001.lectures.interfaces.animal;


public class Exocoetidae extends Fish implements Flyable {

  public Exocoetidae(String name) {
    super(name);
  }

  @Override
  public boolean canFly() {
    return true;
  }

  @Override
  public int compareTo(Animal a) {
    if (a.getNoOfLegs() == 0) {
      return 1;
    } else {
      return -1;
    }
  }
}