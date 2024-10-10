package com.company.vehicles;

import com.company.details.Engine;

import com.company.professions.Driver;

public class Car {
    public static void main(String[] args) {
        Engine engine = new Engine();
        Driver driver = new Driver();
	for (String Value:args) {
	    System.out.print("Value: " + Value);
	}
        System.out.print("I'm driving!");
    }
}
