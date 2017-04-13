package com.guru.factory.test;

import com.guru.factory.abstractfactory.ComputerFactory;
import com.guru.factory.abstractfactory.PCFactory;
import com.guru.factory.abstractfactory.ServerFactory;

import com.guru.factory.model.IComputer;

public class TestFactory {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*IComputer pc = ComputerFactory.getComputer("pc","2 GB","500 GB","2.4 GHz");
		IComputer server = ComputerFactory.getComputer("server","16 GB","1 TB","2.9 GHz");
		System.out.println("Factory PC ::"+pc.systemConfigDetails());
		System.out.println("Factory Server ::"+server.systemConfigDetails());*/
		IComputer pc = ComputerFactory.getComputer(new PCFactory("2 GB","500 GB","2.4 GHz"));
		IComputer server =ComputerFactory.getComputer(new ServerFactory("16 GB","1 TB","2.9 GHz"));
		System.out.println("AbstractFactory PC Config::"+pc.systemConfigDetails());
		System.out.println("AbstractFactory Server Config::"+server.systemConfigDetails());
	}

}
