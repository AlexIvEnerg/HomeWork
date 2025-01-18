public class Bear extends Animal {
    public Bear(String name) {
        super(name);
    }

    public String makeNoise() {
        System.out.println("Noise from " + name);
        return "bearish roar";
    }

    public String eat() {
        System.out.print(name +" food: ");
        return "insects, rodents, plants";
    }

    public String getDescription() {
        System.out.print(name +" family: ");
        return "mammalian predators";
    }
}
