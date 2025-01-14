package org.csu.cpsc;

public class Task {
    private String name;
    private int originalDuration;
    private String description;
    private int timeLogged;

    public Task(String name, int originalDuration, String description) {
        this.name = name;
        this.originalDuration = originalDuration;
        this.description = description;
        this.timeLogged = 0;
    }

    public String getName() {
        return name;
    }

    public int getOriginalDuration() {
        return originalDuration;
    }

    public String getDescription() {
        return description;
    }

    public int getTimeLogged() {
        return timeLogged;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setOriginalDuration(int originalDuration) {
        this.originalDuration = originalDuration;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setTimeLogged(int additionalTime) {
        if (additionalTime > 0) {
            this.timeLogged += additionalTime;
        } else {
            System.out.println("Additional time must be positive.");
        }
    }

    @Override
    public String toString() {
        return "Name: " + name + 
               "\nDescription: " + description + 
               "\nOriginal Estimate: " + originalDuration + 
               "\nTime Logged: " + timeLogged;
    }
}
