package com.bridgelabz;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MoodAnalyserTest {
    /*
     * Refactor: analyseMood method will change to support no parameters and use message Field defined for the Class.
     */
    @Test
    public void givenMessageWhenMoodResultsSad() {
        /*
         * TC1.1 : analyseMood method can just return SAD to pass this Test Case
         */
        MoodAnalyser moodAnalyser = new MoodAnalyser("I am in Sad Mood");
        String myMood = moodAnalyser.analyseMood();
        Assertions.assertEquals("SAD",myMood);
        System.out.println(myMood);
    }
    @Test
    public void givenMessageWhenMoodResultHappy() {
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
         * TC2.1 : Given Null Mood Should Return Happy using try-catch
         */
        MoodAnalyser moodAnalyser = new MoodAnalyser(null);
        String myMood = moodAnalyser.analyseMood();
        Assertions.assertEquals("HAPPY",myMood);
        System.out.println(myMood);
    }
}
