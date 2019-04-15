package com.spring.presentation;

import org.springframework.stereotype.Component;

@Component
public class ToyotaEngine implements Engine{

	@Override
	public void startEngine() {
		// TODO Auto-generated method stub
		System.out.println("Engine Started");		
	}
	public void stopEngine() {
		System.out.println("Engine Stopped");
	}
	
}
