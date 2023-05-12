package com.bridgelabz;

public class MoodAnalyser {
    /*
     Refactor the code to take the mood message in Constructor.
     */
    private String message;

    public MoodAnalyser() {
        /*
         Default Constructor
         */
    }

    public MoodAnalyser(String message) {
        /*
         Parameterised Constructor
         */
        this.message = message;
    }

    public String analyseMood() {
        /*
         * UC1: Call Analyse Mood function with message as parameter and return Happy or Sad mood.
         * UC2: Handle Exception if User Provides Invalid Mood(try-catch).
         */
        try {
            if (message.contains("I am in sad mood")) {
                return "SAD";
            } else
                return "HAPPY";
        } catch (NullPointerException e) {
            return "HAPPY";
        }
    }
}
