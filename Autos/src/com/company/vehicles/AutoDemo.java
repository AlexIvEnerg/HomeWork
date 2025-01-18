package com.company.vehicles;
import com.company.professions.Driver;
import com.company.details.Engine;

public class AutoDemo {
    public static void main(String[] args) {
        Driver driver1 = new Driver(18, "Иванова И.А.");
        Engine eng1 = new Engine(152, "Automobile_Dacia");
        Car car = new Car("Renault", "passeng_car", 1228, driver1, eng1);
        System.out.println(car);
    }
}
