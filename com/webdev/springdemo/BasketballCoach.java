package com.webdev.springdemo;

public class BasketballCoach implements Coach {
	@Override
	public String getDailyWorkout() {
		return "Let's play basketball!";
	}
	
	@Override
	public String getDailyFortune() {
		return "Hello fortune from basketball coach";
	}
}
