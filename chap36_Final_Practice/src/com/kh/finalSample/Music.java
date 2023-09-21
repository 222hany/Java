package com.kh.finalSample;

public class Music {
	private String genre;
	private String mood;
	
	public Music(String genre, String mood) {
		this.genre = genre;
		this.mood = mood;
	}
	
	public String getGenre() {
		return genre;
	}

	public String getMood() {
		return mood;
	}

	public void setGenre(String genre) {
		this.genre = genre;
	}

	public void setMood(String mood) {
		this.mood = mood;
	}
}
