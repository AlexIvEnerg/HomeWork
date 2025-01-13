import professions.Driver;

public class SportCar extends Car {
    double speed;

    public SportCar(String brand, String carClass, int weigth, Driver driver, Engine engine, double speed) {
        super(brand, carClass, weigth, driver, engine);
        this.speed = speed;
    }

}
