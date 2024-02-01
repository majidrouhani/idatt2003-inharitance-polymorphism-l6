package edu.ntnu.idatt2003.lectures.interfaces.animal;

/**
 * The Animal class represents an abstract animal.
 * It implements the Moveable interface and provides common functionality for all animals.
 */
public abstract class Animal implements Moveable {
  private final int noOfLegs;
  
  /**
   * Constructs an Animal object with the specified number of legs.
   *
   * @param noOfLegs the number of legs the animal has
   */
  protected Animal(int noOfLegs) {
    this.noOfLegs = noOfLegs;
  }

  /**
   * Checks if the animal can move.
   *
   * @return true if the animal can move, false otherwise
   */
  @Override
  public boolean canMove() {
    return true;
  }

  /**
   * Gets the number of legs the animal has.
   *
   * @return the number of legs
   */
  public int getNoOfLegs() {
    return noOfLegs;
  }
}
