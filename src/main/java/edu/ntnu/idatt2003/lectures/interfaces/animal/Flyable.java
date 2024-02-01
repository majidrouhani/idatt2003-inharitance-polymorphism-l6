package edu.ntnu.idatt2003.lectures.interfaces.animal;

/**
 * The Flyable interface represents an entity that is capable of flying.
 * It extends the Moveable interface.
 */
public interface Flyable extends Moveable {
  /**
   * Checks if the entity can fly.
   *
   * @return true if the entity can fly, false otherwise.
   */
  boolean canFly();
}
