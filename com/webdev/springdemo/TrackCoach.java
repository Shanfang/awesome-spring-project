package com.webdev.springdemo;

public class TrackCoach implements Coach {
	
	private FortuneService fortuneService;
	
	public TrackCoach() {
		
	}
	public TrackCoach(FortuneService fortuneService) {
		super();
		this.fortuneService = fortuneService;
	}

	@Override
	public String getDailyWorkout() {
		return "Run a hard 5K";
	}
	
	@Override
	public String getDailyFortune() {
		return "Another fortune:" + fortuneService.getFortune();
	}
	
	public void doInitStuff() {
		System.out.println("Track Coach: inside the doInitStuff method");
	}
	
	public void doCleanUp() {
		System.out.println("Track Coach: inside the doCleanUp method");
	}
}
