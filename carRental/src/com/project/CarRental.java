package com.project;
import java.util.Scanner;
import java.util.Arrays;

public class CarRental {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("Welcome to MEIMENG car rent system:");
		System.out.println("Are you going to rent a car: 1. Yes   0. No");
		Scanner use = new Scanner(System.in);
		int yesorno = use.nextInt();
		int sumManned = 0;
		int sumCargo = 0;
		int sumPrice = 0;
		
		if(yesorno == 0){
			System.out.println("Thanks for using MEIMENG car rent system!");
		}
		
		//set up 6 brands' car objects
		Car audiA4 = new Car();
		Car mazda6 = new Car();
		Car chevy6 = new Car();
		Car kingLong = new Car();
		Car songhuaRiver = new Car();
		Car iveco = new Car();
		
		//set up the id for 6 brands' cars
		audiA4.id = 1;
		mazda6.id = 2;
		chevy6.id = 3;
		kingLong.id = 4;
		songhuaRiver.id = 5;
		iveco.id = 6;
		
		//set up the name for 6 brands' cars
		audiA4.name = "AudiA4";
		mazda6.name = "Mazda6";
		chevy6.name = "Chevy6";
		kingLong.name = "KingLong";
		songhuaRiver.name ="SonghuaRiver";
		iveco.name = "Iveco";
		
		//set up the rental fee for 6 brands' cars
		audiA4.rentalFee = 500;
		mazda6.rentalFee = 400;
		chevy6.rentalFee = 450;
		kingLong.rentalFee = 800;
		songhuaRiver.rentalFee = 400;
		iveco.rentalFee = 1000;
		
		//set up the manned for 6 brands' cars
		audiA4.manned = 4;
		mazda6.manned = 4;
		chevy6.manned = 4;
		kingLong.manned = 20;
		songhuaRiver.manned = 0;
		iveco.cargo = 0;
		
		//set up the cargo for 6 brands' cars
		audiA4.cargo = 0;
		mazda6.cargo = 0;
		chevy6.cargo = 2;
		kingLong.cargo = 0;
		songhuaRiver.cargo = 4;
		iveco.cargo = 20;
		
		//Print the rental car's information to customers
		System.out.println("The rental cars' information:");
		System.out.println("ID" + "\t" + "Name" + "       \t" + "Rental" + "     \t" + "Container");
		audiA4.printout(audiA4.id, audiA4.name, audiA4.rentalFee, audiA4.manned, audiA4.cargo);
		mazda6.printout(mazda6.id, mazda6.name, mazda6.rentalFee, mazda6.manned, mazda6.cargo);
		chevy6.printout(chevy6.id, chevy6.name, chevy6.rentalFee, chevy6.manned, chevy6.cargo);
		kingLong.printout(kingLong.id, kingLong.name, kingLong.rentalFee, kingLong.manned, kingLong.cargo);
		songhuaRiver.printout(songhuaRiver.id, songhuaRiver.name, songhuaRiver.rentalFee, songhuaRiver.manned, songhuaRiver.cargo);
		iveco.printout(iveco.id, iveco.name, iveco.rentalFee, iveco.manned, iveco.cargo);
		
		System.out.println("Please enter the number of cars you want to rent:");
		Scanner num = new Scanner(System.in);
		int rentCar = num.nextInt();
		int[] carId = new int[rentCar];
		
		for(int i = 0; i < rentCar; i++){
			System.out.println((i+1) + ".\tPlease enter the ID number:");
			Scanner carID = new Scanner(System.in);
			int Idi = carID.nextInt();
			if(Idi > 6 || Idi < 1){
				System.out.println("Please enter the right ID.");
				carID = new Scanner(System.in);
				Idi = carID.nextInt();
			}
			carId[i] = Idi;
		}
		
		System.out.println("Your billing:");
		System.out.println("***Manned Car:");
		for(int j = 0; j < carId.length; j++){
			switch (carId[j]){
			case 1:
				System.out.print("AudiA4\t");
				sumManned += 4;
				break;
			case 2:
				System.out.print("Mazda6\t");
				sumManned += 4;
				break;
			case 3:
				System.out.print("Chevy6\t");
				sumManned += 4;
				break;
			case 4:
				System.out.print("KingLong\t");
				sumManned += 20;
				break;
			}	
		}
		System.out.println("Total: " + sumManned + "person");
		
		System.out.println("***Cargo Car:");
		for(int j = 0; j < carId.length; j++){
			switch (carId[j]){
			case 3:
				System.out.print("Chevy6\t");
				sumCargo += 2;
				break;
			case 5:
				System.out.print("SonghuaRiver\t");
				sumCargo += 4;
				break;
			case 6:
				System.out.print("Iveco\t");
				sumCargo += 20;
				break;
			}	
		}
		System.out.println("Total: " + sumCargo + "tons");

		System.out.println("***Total Price:");
		for(int j = 0; j < carId.length; j++){
			switch (carId[j]){
			case 1:
				//System.out.print("AudiA4\t");
				sumPrice += 500;
				break;
			case 2:
				//System.out.print("Mazda6\t");
				sumPrice += 400;
				break;
			case 3:
				//System.out.print("Chevy6\t");
				sumPrice += 450;
				break;
			case 4:
				//System.out.print("KingLong\t");
				sumPrice += 800;
				break;
			case 5:
				//System.out.print("SonghuaRiver\t");
				sumPrice += 400;
				break;
			case 6:
				//System.out.print("Iveco\t");
				sumPrice += 1000;
				break;
			}	
		}
		System.out.println("Total: " + sumPrice + "$");
		//System.out.println(Arrays.toString(carId));
	}

}
