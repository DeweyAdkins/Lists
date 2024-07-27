package org.example;

public class Animal {
    private String name;
    private boolean isDog;


    public Animal(String name, boolean isDog) {
        this.name = name;
        this.isDog = isDog;
    }

    public Animal(String name) {
        this.name = name;
        this.isDog = false;
    }

    public Animal() {
        this.name = "Unknown";
        this.isDog = false;
    }

    public String getName() {
        return name;
    }

    public boolean getIsDog() {
        return isDog;
    }

    @Override
    public String toString() {
        return "Animal: " + getName() + ", Is Dog: " + getIsDog();
    }
}
