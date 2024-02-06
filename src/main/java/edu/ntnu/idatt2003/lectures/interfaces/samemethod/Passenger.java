package edu.ntnu.idatt2003.lectures.interfaces.samemethod;

/**
 * Represents a passenger who can be both a person and a pet.
 */
public class Passenger implements Person, Pet {

  private String fullName;
  private String owner;
  private String gender;

  /**
   * Constructs a new Passenger object with the specified full name and gender.
   * 
   * @param fullName the full name of the passenger
   * @param gender   the gender of the passenger
   */
  public Passenger(String fullName, String gender) {
    super();
    this.fullName = fullName;
    this.gender = gender;
  }

  /**
   * Constructs a new Passenger object with the specified full name, gender, and owner.
   * 
   * @param fullName the full name of the passenger
   * @param gender   the gender of the passenger
   * @param owner    the owner of the passenger
   */
  public Passenger(String fullName, String gender, String owner) {
    super();
    this.fullName = fullName;
    this.owner = owner;
    this.gender = gender;
  }

  /**
   * Sets the full name of the passenger.
   * 
   * @param fullName the full name of the passenger
   */
  public void setFullName(String fullName) {
    this.fullName = fullName;
  }

  /**
   * Returns the full name of the passenger.
   * 
   * @return the full name of the passenger
   */
  @Override
  public String getFullName() {
    return this.fullName;
  }

  /**
   * Sets the owner of the passenger.
   * 
   * @param owner the owner of the passenger
   */
  public void setOwner(String owner) {
    this.owner = owner;
  }

  /**
   * Returns the owner of the passenger.
   * 
   * @return the owner of the passenger
   */
  @Override
  public String getOwner() {
    return this.owner;
  }

  /**
   * Sets the gender of the passenger.
   * 
   * @param gender the gender of the passenger
   */
  public void setGender(String gender) {
    this.gender = gender;
  }

  /**
   * Returns the gender of the passenger.
   * 
   * @return the gender of the passenger
   */
  @Override
  public String getGender() {
    return this.gender;
  }

  /**
   * Returns a string representation of the passenger.
   * 
   * @return a string representation of the passenger
   */
  @Override
  public String toString() {
    String message = "Passenger [getFullName()=" + getFullName() + ", getGender()=" + getGender();

    if (getOwner() != null) {
      message += ", getOwner()=" + getOwner();
    }
    return message;
  }

}
