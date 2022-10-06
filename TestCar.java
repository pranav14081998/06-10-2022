package com.files.test.bll;

import java.io.File;
import java.io.IOException;

public class TestCar {

	public static void main(String[] args) {
		
		try {
			Car c1 = new Car("Audi",2012,3000,1900000.08);
			Car c2 = new Car("BMW",2011,5000,1700000.05);
			Car c3 = new Car("MG",2021,0,800000.06);
			Car c4 = new Car("Kia",2012,35000,850000.03);
			Car c5 = new Car("Maruti",2005,0,30000.00);
			Car c6 = new Car("Tata Harrier",2010,100000,650000.06);
			Car c7 = new Car("Rolls Royce",2013,35000,4000000.08);
			Car c8 = new Car("Honda City",2007,250000,300000.00);
			Car c9 = new Car("Kia Sonet",2022,0,450000.05);
			Car c10= new Car("Tata Harriers",2010,356200,400000.03);
			
		
			
			Car [] cars1 = new Car[] {c1,c2,c3,c4,c5,c6,c7,c8,c9,c10};
			
		
			File f = new File("cars.txt");
			f.delete();
			
			
			CarList carList = new CarList("cars.txt");
			
			for(Car c : cars1) {
				carList.addCar(c);
			}
			
			
			System.out.println("New Cars : " + carList.countNewCars());
			
			
			System.out.println("Most expensive Car : " +carList.mostExpensiveCar());
			
			
			carList.removeCar(c9);
			System.out.println("After removal, new Cars: " +carList.countNewCars());
		
			}
			catch(Exception ex) { 
			
				System.out.println(ex.getMessage());
			}

	}
	
}
	
		

