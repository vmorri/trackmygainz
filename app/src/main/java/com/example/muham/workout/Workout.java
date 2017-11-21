package com.example.muham.workout;

class Exercise{
    //fill later for testing
}

public class Workout {
    String name;
    int Date;
    Exercise ex[];
    int rest;

    public Workout(String name){
        this.name = name;
    }

    private void addExercise(Exercise exercise){
        this.ex[ex.length] = exercise;
    }

    private void delExercise(int index){
    }

    private void moveExerciseUp(int index){
        if(index == 0)
            return;
        Exercise temp = this.ex[index - 1];
        this.ex[index - 1] = this.ex[index];
        this.ex[index] = temp;
    }

    private void moveExerciseDown(int index){
        if(index >= this.ex.length)
            return;
        Exercise temp = this.ex[index + 1];
        this.ex[index + 1] = this.ex[index];
        this.ex[index] = temp;
    }

    private void save(){

    }
}
