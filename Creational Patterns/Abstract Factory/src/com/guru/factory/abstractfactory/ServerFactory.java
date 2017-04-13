package com.guru.factory.abstractfactory;

import com.guru.factory.model.IComputer;

import com.guru.factory.model.Server;

public class ServerFactory implements ComputerAbstractFactory {

	private String ram;
	private String hdd;
	private String cpu;
	
	public ServerFactory(String ram, String hdd, String cpu){
		this.ram=ram;
		this.hdd=hdd;
		this.cpu=cpu;
	}
	@Override
	public IComputer createComputer() {
		 return new Server(ram, hdd, cpu);
	}

}