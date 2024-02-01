package edu.ntnu.idatt2003.lectures.interfaces.multiple;

public class App {

    public static void main(String[] args) {
        String languageName = "Java";

        // create object of Language class
        Language java = new Language(languageName);

        java.connectServer();

        // call the inherited method of Frontend class
        java.responsive(languageName);
    }
}
