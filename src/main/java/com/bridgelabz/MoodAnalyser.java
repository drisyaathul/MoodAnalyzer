package com.bridgelabz;

public class MoodAnalyser {

    public String analyseMood(String message) {
        /*
         * UC1: Call Analyse Mood function with message as parameter and return Happy or Sad mood.
         */
        if (message.contains("Sad")) {
            return "SAD";
        }else
            return "HAPPY";
    }
}
