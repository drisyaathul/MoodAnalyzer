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
         REFACTORED: In case of NULL or Empty Mood throw Custom Exception MoodAnalysisException.
         In try catch block throw MoodAnalysisException
         */
        try {
            if (message == null) {
                throw new MoodAnalysisException(MoodAnalysisException.ExceptionType.EMPTY, "Message is Empty");
            } else if (message.contains("I am in Sad Mood")) {
                return "SAD";

            } else
                return "HAPPY";
        }
        catch (NullPointerException e) {
            throw new MoodAnalysisException(MoodAnalysisException.ExceptionType.NULL, "Invalid message");
        }
    }
}
