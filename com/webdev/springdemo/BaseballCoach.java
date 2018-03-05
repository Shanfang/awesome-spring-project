package com.webdev.springdemo;

public class BaseballCoach implements Coach {
	// define a private field for dependency injection
	private FortuneService fortuneService;
	
	// define a constructor for dependency injection
	BaseballCoach(FortuneService theFortuneService) {
		fortuneService  = theFortuneService;
	}
	
	@Override
	public String getDailyWorkout() {
		return "Work out now";
	}
	
	@Override 
	public String getDailyFortune() {
		return fortuneService.getFortune();
	}
}
