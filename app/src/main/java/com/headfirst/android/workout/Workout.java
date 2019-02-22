package com.headfirst.android.workout;

public class Workout {
    private String name;
    private String description;

    public static final Workout[] workouts = {
            new Workout("The limb loosener",
                    "5 handstand pushups\n10 1 legged squats\n15 pullups"),
            new Workout("core agoney",
                    "100 pullups\n100 squats\n100 pushups\n100 situps"),
            new Workout("the wimp special",
                    "5 pullups\n2 pushups\n4 squats"),
            new Workout("Strengths and length",
                    "500 meter run\n21 x 5 kettleballs\na lot of pushups")
    };

    private Workout(String name, String desc) {
        this.name = name;
        this.description = desc;
    }

    public String getName() {
        return this.name;
    }

    public String getDescription() {
        return this.description;
    }

    public String toString() {
        return this.name;
    }



}
