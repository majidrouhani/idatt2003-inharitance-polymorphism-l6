package edu.ntnu.idatt2003.lectures.interfaces.funcationalinterface.defaultmethod;

public interface DoubleValueComputer {
  public double compute(double x, double y);
  
  public default double compute(double x, double y, double z) {    
    return 0;    
  }
}
