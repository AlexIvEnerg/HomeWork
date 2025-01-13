import professions.Driver;

public class Lorry extends Car {
    int carrying;

    public Lorry(String brand, String carClass, int weigth, Driver driver, Engine engine, int carry) {
        super(brand, carClass, weigth, driver, engine);
        this.carrying = carry;
    }
    
}
