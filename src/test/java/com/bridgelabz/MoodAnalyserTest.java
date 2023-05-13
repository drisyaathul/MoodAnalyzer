package com.bridgelabz;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MoodAnalyserTest {
    /*
     * Refactor: Using Custom Exception Mood
     */
    @Test
    public void givenMessageWhenMoodResultsSad() throws MoodAnalysisException{
        /*
         * TC1.1 : analyseMood method can just return SAD to pass this Test Case
         */
        MoodAnalyser moodAnalyser = new MoodAnalyser("I am in Sad Mood");
        String myMood = moodAnalyser.analyseMood();
        Assertions.assertEquals("SAD",myMood);
        System.out.println(myMood);
    }
    @Test
    public void givenMessageWhenMoodResultHappy() throws MoodAnalysisException {
        /*
         * TC1.2 : analyseMood method can just return HAPPY to pass this Test Case
         */
        MoodAnalyser moodAnalyser = new MoodAnalyser("I am in Any Mood");
        String myMood = moodAnalyser.analyseMood();
        Assertions.assertEquals("HAPPY",myMood);
        System.out.println(myMood);
    }
    @Test
    public void givenMessageIsNullResultsHappy() {
        /*
            Using Enum (NULL,EMPTY) to differentiate the Mood Analysis Errors
         */
        MoodAnalyser moodAnalyser = new MoodAnalyser("NULL");
        try {
            moodAnalyser.analyseMood();
        }
        catch (MoodAnalysisException e) {
            Assertions.assertEquals(MoodAnalysisException.ExceptionType.NULL,e.getType());
            System.out.println(e);
        }
    }
    @Test
    public void givenMessageIsEmptyResultsEmptyMood() {
        /*
            Using Enum (NULL,EMPTY) to differentiate the Mood Analysis Errors
         */
        MoodAnalyser moodAnalyser = new MoodAnalyser(" ");
       try {
           moodAnalyser.analyseMood();
       }
       catch (MoodAnalysisException e) {
           Assertions.assertEquals(MoodAnalysisException.ExceptionType.EMPTY,e.getType());
           System.out.println(e);
       }
    }
}
