package run;

import coach_implementations.BaseballCoach;
import interfaces.Coach;

public class MyApp {
    public static void main(String[] args) {
        //create the object
        Coach theCoach = new BaseballCoach();

        //use the object
        System.out.println(theCoach.getDailyWorkout());
    }
}
