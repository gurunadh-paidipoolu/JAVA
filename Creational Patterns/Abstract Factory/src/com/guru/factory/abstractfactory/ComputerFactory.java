package com.guru.factory.abstractfactory;

import com.guru.factory.model.IComputer;

public class ComputerFactory {

	public static IComputer getComputer(ComputerAbstractFactory factory){
		return factory.createComputer();
	}
}
