package com.example.muham.workout;

import java.util.ArrayList;

class Exercise{
    //fill later for testing
}

public class Workout {
    String name;
    int Date;
    ArrayList<Exercise> ex;
    int rest;

    public Workout(String name){
        this.name = name;
    }

    private void addExercise(Exercise exercise){
        this.ex.add(exercise);
    }

    private void delExercise(int index){
        this.ex.remove(index);
    }
    private void moveExerciseUp(int index){
        Exercise temp = this.ex.get(index - 1);
        this.ex.set((index - 1), this.ex.get(index));
        this.ex.set(index, temp);
    }

    private void moveExerciseDown(int index){
        Exercise temp = this.ex.get(index + 1);
        this.ex.set((index + 1), this.ex.get(index));
        this.ex.set(index, temp);
    }

    private void save(){

    }
}
