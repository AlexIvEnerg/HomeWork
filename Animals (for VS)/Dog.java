public class Dog extends Animal {
    public Dog(String name) {
        super(name);
    }
    
    public String makeNoise() {
        System.out.println("Noise from " + name);
        return "dogs barking";
    }

    public String eat() {
        System.out.print(name +" Food: ");
        return "meat, cereals";
    }

    public String getDescription() {
        System.out.print(name +" family: ");
        return "mammalian predators";
    }
}
