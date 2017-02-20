package com.project;

public class Car {
	int id;
	String name;
	int rentalFee;
	int manned;
	int cargo;
	
	public void printout(int id, String name, int rentalFee, int manned, int cargo){
		if(cargo == 0){
			System.out.println(id + ".\t" + name + "   \t" + rentalFee + "$/day" + "\t" + "manned:" + manned + "person");
		}else if(manned == 0){
			System.out.println(id + ".\t" + name + "   \t" + rentalFee + "$/day" + "\t" + "cargo:" + cargo + "ton");
		}else{
			System.out.println(id + ".\t" + name + "   \t" + rentalFee + "$/day" + "\t" + "manned:" + manned + "person" + "  cargo:" + cargo + "person");
		}
	}
}
