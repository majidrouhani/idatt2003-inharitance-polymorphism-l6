package edu.ntnu.idatt2001.lectures.interfaces.multiple;

abstract class Frontend {
    private String appName = "Testing";

    abstract void connectServer();

    public void responsive(String str) {
        System.out.println(appName+": "+ str + " can also be used as frontend.");
    }
}
