package com.moodanalyser;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.Test;

public class MoodAnalyserTest {

	@Test
	public void testMoodAnalyser() {
		MoodAnalyser analyser = new MoodAnalyser();
		
		assertEquals("happy", analyser.analyseMood("happy"));
		assertEquals("sad", analyser.analyseMood("sad"));
		assertEquals("happy", analyser.analyseMood(null));
		assertEquals("happy", analyser.analyseMood(""));
		assertEquals("happy", analyser.analyseMood(""));

	}
	
}