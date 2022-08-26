package com.Arc;

import org.springframework.context.support.ClassPathXmlApplicationContext;

//Mobile is Application
public class Mobile {

	public static void main(String[] args) {
		
		//Receiving bean from Application context
		//creating object of ClaasPathXml and loading context file
		
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("Context.xml");
		
         Sim sim = context.getBean("airtel", Sim.class);
		
		System.out.println(sim.Internet());
		
		System.out.println(sim.Calling());
		
		/*
		 * Sim sim = context.getBean("airtel", Sim.class);
		 * 
		 * System.out.println(sim.Internet());
		 */
		
		
		
	//	Calling airtel by creating Object of it.
	/*
	 * // Airtel airtel = new Airtel(); // // airtel.Internet(); 
	 * System.out.println(airtel.Internet());
	 */		
		//Calling Airtel through Sim interface
		/*
		 * Sim sim = new Airtel();
		 * 
		 * System.out.println(sim.Internet());
		 */
		
		//Calling Jio through Ssssim inteface
		
		/*
		 * Sim sim = new Jio();
		 * 
		 * System.out.println(sim.Internet());
		 */
		
		
		
	}

}
