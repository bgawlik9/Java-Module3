package com.kodilla.collections.adv.immutable.homework;

public class TaskHacked extends Task{
    public TaskHacked(String title, int duration) {
        super(title, duration);
    }

    public void modifyTask (String newTitle){
        title = newTitle;
    }
}
