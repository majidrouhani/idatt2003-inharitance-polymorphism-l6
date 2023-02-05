package edu.ntnu.idatt2001.lectures.interfaces.animal;

public abstract class Animal implements Moveable {
  private final int noOfLegs;
  
  protected Animal(int noOfLegs) {
    this.noOfLegs = noOfLegs;
  }

  @Override
  public boolean canMove() {
    return true;
  }

  public int getNoOfLegs() {
    return noOfLegs;
  }
}
