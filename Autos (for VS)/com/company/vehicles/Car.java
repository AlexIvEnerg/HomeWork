
import professions.Driver;

public class Car {
    String brand;
    String carClass;
    int weigth;
    Driver driver;
    Engine engine;
    
    public Car(String brand, String carClass, int weigth, Driver driver, Engine engine) {
        this.brand = brand;
        this.carClass = carClass;
        this.weigth = weigth;
        this.driver = driver;
        this.engine = engine;
    }
    public Car() {
    }
    public void start() {
        System.out.println("Поехали");
    }
    public void stop() {
        System.out.println("Останавливаемся");
    }
    public void turnRight() {
        System.out.println("Поворот направо");
    }
    public void turnLeft() {
        System.out.println("Поворот налево");
    }
    
    public String toString() {
        return brand + ", "+ carClass +", "+ weigth + ", "
        + driver.getExperience() + ", "+ driver.getFullName()+ ", "
        + engine.getPower() + ", "+ engine.getCompany();
    }
    
}
