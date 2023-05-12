package com.bridgelabz;

public class MoodAnalyser {

    public String analyseMood(String message) {
        /*
         * UC1: Call Analyse Mood function with message as parameter and return Happy or Sad mood.
         */
        if (message.contains("I am in Sad Mood")) {
            return "SAD";
        }else
            return "HAPPY";
    }
}
