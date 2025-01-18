package com.company.vehicles;
import com.company.professions.Driver;
import com.company.details.Engine;

public class SportCar extends Car {
    double speed;

    public SportCar(String brand, String carClass, int weigth, Driver driver, Engine engine, double speed) {
        super(brand, carClass, weigth, driver, engine);
        this.speed = speed;
    }

}
