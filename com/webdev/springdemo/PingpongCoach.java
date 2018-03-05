package com.webdev.springdemo;

public class PingpongCoach implements Coach {
	@Override
	public String getDailyWorkout() {
		return "Let's play ping pong!";
	}
	
	@Override
	public String getDailyFortune() {
		return "Hello fortune from pingpong coach";
	}
 }
