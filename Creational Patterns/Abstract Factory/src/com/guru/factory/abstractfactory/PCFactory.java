package com.guru.factory.abstractfactory;

import com.guru.factory.model.IComputer;
import com.guru.factory.model.PC;

public class PCFactory implements ComputerAbstractFactory {

	private String ram;
	private String hdd;
	private String cpu;
	
	public PCFactory(String ram, String hdd, String cpu){
		this.ram=ram;
		this.hdd=hdd;
		this.cpu=cpu;
	}
	@Override
	public IComputer createComputer() {
		return new PC(ram,hdd,cpu);
	}

}