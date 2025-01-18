public class Main {
    public static void main(String[] args) {
        Animal[] animals = new Animal[3];
        animals[0] = new Dog("Dogs");
        animals[1] = new Cat("Cats");
        animals[2] = new Bear("Bear");
        System.out.println(" ");
        for(Animal animal : animals) {
            System.out.println(animal.makeNoise());
            System.out.println(animal.eat());            
        }
        
        Ветеринар прием = new Ветеринар();
        for(Animal animal2 : animals) {
            прием.treatAnimal(animal2);
        }
    }
}
