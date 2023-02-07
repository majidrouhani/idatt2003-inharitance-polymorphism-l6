package edu.ntnu.idatt2001.lectures.interfaces.animal;


public class Fish extends Animal implements Comparable<Animal>, Swimable, Eatable {
  private final String name;

  public Fish(String name) {
    super(0);
    this.name = name;
  }

  @Override
  public boolean canEat() {
    return true;
  }

  @Override
  public boolean canSwim() {
    return true;
  }

  public String getName() {
    return name;
  }

  @Override
  public String toString() {
    return "Fish [name=" + name + "]";
  }

  @Override
  public int hashCode() {
    final int prime = 31;
    int result = 1;
    result = prime * result + ((name == null) ? 0 : name.hashCode());
    return result;
  }

  @Override
  public boolean equals(Object obj) {
    if (this == obj)
      return true;
    if (obj == null)
      return false;
    if (getClass() != obj.getClass())
      return false;
    Fish other = (Fish) obj;
    if (name == null) {
      if (other.name != null)
        return false;
    } else if (!name.equals(other.name))
      return false;
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