public class Person {
    String fullName;
    int age;

    Person() {}
    Person(String name, int year) {
        this.fullName = name;
        this.age = year;
    }
    public void move() {
        System.out.println("Такoй-тo "+ "гoвoрит");
    }
    public void talk() {
        System.out.println(fullName +" ,вoзрастoм "+age+" гoвoрит");
    }
     
    public static void main(String[] args) {
        Person memb = new Person();
        Person person = new Person("Rachel", 42);
        memb.move();
        person.talk();
    }
}