package com.google.training.helloworld;

public class HelloClass {
    public String message = "Are you hungry?";

    public HelloClass () {
    }

    public HelloClass (String name) {
        this.message = "Are you hungry? " + name + "!";
    }

    public HelloClass (String name, String period) {
    	this.message = period+ "! " + "Are you hungry? " + name+"!";
    }
    public String getMessage() {
        return message;
    }
}
