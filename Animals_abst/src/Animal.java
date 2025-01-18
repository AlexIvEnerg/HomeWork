public abstract class Animal {
    String name;

    public Animal(String name) {
        this.name = name; 
    }
    
    public abstract String makeNoise();

    public abstract String eat();

    public abstract String getDescription();
}
