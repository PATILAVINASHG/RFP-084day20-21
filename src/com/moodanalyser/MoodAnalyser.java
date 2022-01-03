package com.moodanalyser;

public class MoodAnalyser {

	public String analyseMood(String mood) {
		try {
			if (mood == null || mood.isEmpty()) {
				throw new InvalidMoodException("null value passed");
			}
		//	int a = 10 / 0;
		} catch (InvalidMoodException e) {
			e.printStackTrace();
			return "happy";
		} catch (Exception e) {
			e.printStackTrace();
		}
		return mood;
	}

	public static void main(String[] args) {
		try {
			int a = 10 / 0;

			System.out.println(a);

		}
		catch (Exception e) {
			e.printStackTrace();
		}

		int b = 15 / 2;
		System.out.println(b);
	}

}