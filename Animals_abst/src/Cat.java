public class Cat extends Animal {
    public Cat(String name) {
        super(name);
    }

    public String makeNoise() {
        System.out.println("Noise from " + name);
        return "cat meowing";
    }

    public String eat() {
        System.out.print(name + "Food: ");
        return "dry food, fish";
    }

    public String getDescription() {
        System.out.print(name +" family: ");
        return "mammalian predators";
    }
}
