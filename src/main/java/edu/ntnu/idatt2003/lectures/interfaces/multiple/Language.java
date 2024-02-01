package edu.ntnu.idatt2003.lectures.interfaces.multiple;

class Language extends Frontend implements Backend {
  private final String name;

  Language(String name) {
    this.name = name;
  }

  // implement method of interface
  public void connectServer() {
    System.out.println(name + " can be used as backend language.");
  }
}