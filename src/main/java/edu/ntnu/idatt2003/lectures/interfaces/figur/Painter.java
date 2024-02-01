package edu.ntnu.idatt2003.lectures.interfaces.figur;

import java.util.ArrayList;
import java.util.List;

/**
 * The Painter class represents a painter who can paint objects that implement the Paintable interface.
 * It maintains a list of paintable objects and provides methods to add objects to the list and paint all objects in the list.
 */
public class Painter {
  private List<Paintable> paintableObjects;

  public Painter() {
    paintableObjects = new ArrayList<>();
  }

  public List<Paintable> getPaintableObjects() {
    return paintableObjects;
  }

  public void setPaintableObjects(List<Paintable> paintableObjects) {
    this.paintableObjects = paintableObjects;
  }

  /**
   * Adds a paintable object to the list of paintable objects.
   * 
   * @param paintableObject the paintable object to be added
   */
  public void add(Paintable paintableObject) {
    if (this.paintableObjects != null) {
      this.paintableObjects.add(paintableObject);
    }
  }

  /**
   * Paints all objects in the list of paintable objects.
   */
  public void paintAllObjects() {
    for (Paintable paintable : paintableObjects) {
      paintable.paint();
    }
  }
}