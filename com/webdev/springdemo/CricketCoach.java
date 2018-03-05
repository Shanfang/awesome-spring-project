package com.webdev.springdemo;

public class CricketCoach implements Coach {

	private FortuneService fortuneService;
	private String emailAddress;
	private String team;
	
	// create a no-arg constructor
	public CricketCoach() {
		System.out.println("Inside the on-arg constructor of cricketcoach");
	}
	public void setFortuneService(FortuneService fortuneService) {
		System.out.println("Inside the setter method: setFortuneService");
		this.fortuneService = fortuneService;
	}
	@Override
	public String getDailyWorkout() {
		return "Practice 15 minutes of bowling";
	}

	@Override
	public String getDailyFortune() {
		return fortuneService.getFortune();
	}
	public String getEmailAddress() {
		return emailAddress;
	}
	public void setEmailAddress(String emailAddress) {
		System.out.println("Inside the setter method: setEmailAddress");
		this.emailAddress = emailAddress;
	}
	public String getTeam() {
		return team;
	}
	public void setTeam(String team) {
		System.out.println("Inside the setter method: setTeam");
		this.team = team;
	}

}
