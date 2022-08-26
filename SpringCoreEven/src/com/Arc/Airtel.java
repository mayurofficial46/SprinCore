package com.Arc;

public class Airtel implements Sim {
	
	//this is only field declaration and this is injection of JapanComp in airtel, after this 
	//you have to use constructor, setter 
	//field or method injection ,inorder to use method of japanInternet
	private JapanComp comp;
	
	
	//blank constructor
	public Airtel() {
		// TODO Auto-generated constructor stub
	}
	
	//setter Injection below but dont forget to create blank constructor first,
	//for setter injection we use property tag in context file
	public void setComp(JapanComp comp) {
		this.comp = comp;
	}
	
	

	/*
	 * //Constructor injection by constructor using field in source (right click) ALSO When using constructor
	 * injection we use constructor arg in context file
	 * 
	 * public Airtel(JapanComp comp) { super(); this.comp = comp; }
	 * 
	 */

	@Override
	public String Internet() {
		
		//return "Airtel Internet";
		
		return comp.Japan6GInternet();
	}

	@Override
	public String Calling() {
		
		return "Airtel Calling";
	}

	

}
