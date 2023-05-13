package com.bridgelabz;

public class MoodAnalysisException extends Exception{
    /*
     * In case of NULL or Empty Mood throw Custom Exception MoodAnalysisException.
     * Use Enum to differentiate the Mood Analysis Errors
     */

    ExceptionType type;
    public MoodAnalysisException(ExceptionType type, String message) {
        //Parameterised Constructor
        super(message);
        this.type = type;
    }
    public ExceptionType getType() {
        return type;
    }
    enum ExceptionType {
        NULL,EMPTY
    }
}
