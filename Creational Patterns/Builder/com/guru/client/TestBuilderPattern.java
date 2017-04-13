package Builder.com.guru.client;

import Builder.com.guru.modelwithbuilder.Computer;

public class TestBuilderPattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Using builder to get the object in a single line of code and 
        //without any inconsistent state or arguments management issues		
Computer comp = new Computer.ComputerBuilder(
		"500 GB", "2 GB").setBluetoothEnabled(true)
		.setGraphicsCardEnabled(true).build();
System.out.println("Computer details are \n"+comp.getConfigDetails());
	}
	

}
