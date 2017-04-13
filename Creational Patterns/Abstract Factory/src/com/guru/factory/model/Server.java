package com.guru.factory.model;

public class Server implements IComputer {

	private String ram;
	private String hdd;
	private String cpu;
	private boolean isGraphicsCardEnabled;
	private boolean isBluetoothEnabled;
	
	public Server(String ram, String hdd, String cpu){
		this.ram=ram;
		this.hdd=hdd;
		this.cpu=cpu;
	}
	@Override
	public String getRAM() {
		return this.ram;
	}

	@Override
	public String getHDD() {
		return this.hdd;
	}

	@Override
	public String getCPU() {
		return this.cpu;
	}
	@Override
	public String systemConfigDetails(){
		return "The configuration details of Server are \nRAM= "+this.getRAM()+", HDD="+this.getHDD()+", CPU="+this.getCPU();
	}
	public boolean isGraphicsCardEnabled() {
		return isGraphicsCardEnabled;
	}
	public boolean isBluetoothEnabled() {
		return isBluetoothEnabled;
	}
	

}
