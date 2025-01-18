public class Student {
    protected String firstName;
    protected String lastName;
    protected String group;
    private double averageMark;
    protected double scolarship;
    
    public Student(String firstName, String lastName, String group) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.group = group;
    }
    public Student() {
    }

    public void setAverageMark(double mark) {
        this.averageMark = mark;
    }
    public void setScolarship(double ship) {
        this.scolarship = ship;
    }
    public double getScholarship() {         
        if(averageMark == 5) scolarship = 2000;
        else scolarship = 1900;
        return scolarship;
    }

    public double getAverageMark() { return averageMark;}
}
