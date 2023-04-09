package com.epam.OOP;

public class Animal {
    private String color;
    private int numberOfPaws;
    private boolean hasFur;

    public Animal(String color, int numberOfPaws, boolean hasFur) {
        this.color = color;
        this.numberOfPaws = numberOfPaws;
        this.hasFur = hasFur;
    }

    public String getDescription() {
        String description = "This animal is mostly " + this.color + ". It has ";
        description += numberOfPaws==1 ? ""+numberOfPaws + " paw and " : "" + numberOfPaws +" paws and ";
        description += this.hasFur ? "a fur." : "no fur.";
        return description;
    }
}
