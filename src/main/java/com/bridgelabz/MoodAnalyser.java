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

    public String analyseMood() throws MoodAnalysisException {
        /*
         * UC1: Call Analyse Mood function with message as parameter and return Happy or Sad mood.
         * UC2: Handle Exception if User Provides Invalid Mood(try-catch).
         */
        try {
            if (message.equals("")) {
                throw new MoodAnalysisException("Empty Mood");
        }else if (message.contains("I am in Sad Mood")) {
                return "SAD";
            } else
                return "HAPPY";
        } catch (NullPointerException e) {
            throw new MoodAnalysisException("HAPPY");
        }
    }
}
