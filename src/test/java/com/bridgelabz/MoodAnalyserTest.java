package com.bridgelabz;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MoodAnalyserTest {

    static MoodAnalyser moodAnalyser = new MoodAnalyser();
    /*
     * UC1: Call Analyse Mood function with message as parameter and return Happy or Sad mood.
     */
    @Test
    public void givenMessageWhenMoodResultsSad() {
        /*
         * TC1.1 : analyseMood method can just return SAD to pass this Test Case
         */
        String myMood = moodAnalyser.analyseMood("I am in Sad Mood");
        Assertions.assertEquals("SAD",myMood);
        System.out.println(myMood);
    }

    @Test
    public void givenMessageWhenMoodResultHappy() {
        /*
         * TC1.2 : analyseMood method can just return HAPPY to pass this Test Case
         */
        String myMood = moodAnalyser.analyseMood(("I am in Any Mood"));
        Assertions.assertEquals("HAPPY",myMood);
        System.out.println(myMood);
    }

}
