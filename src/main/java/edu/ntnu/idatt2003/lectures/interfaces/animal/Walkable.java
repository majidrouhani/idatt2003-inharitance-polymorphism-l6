package edu.ntnu.idatt2003.lectures.interfaces.animal;

/**
 * The Walkable interface represents an entity that can walk.
 * It extends the Moveable interface.
 */
public interface Walkable extends Moveable {
  boolean canWalk();
}
