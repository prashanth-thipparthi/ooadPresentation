package com.spring.presentation;

import java.util.Date;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.stereotype.Component;


// Advice => Before, After
//Pointcut - where

@Component
@Aspect
@EnableAspectJAutoProxy
public class Helper {
	
	@Before("execution(public void start())")  //when ever show start is called
	//@After("execution(public void start())")
	public void startLog() {
		System.out.println("Car started at the time: "+ new Date());
	}
	
	@After("execution(public void stop())")
	public void endLog() {
		System.out.println("Car stopped at the time: "+ new Date());
	}
	
	@Before("execution(public void takeTurn())")
	public void indicatorOn() {
		System.out.println("On the Indicator");		
	}
	
	@After("execution(public void takeTurn())")
	public void indicatorOff() {
		System.out.println("Off the Indicator");		
	}
}
