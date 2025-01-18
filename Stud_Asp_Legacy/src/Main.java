public class Main {
    public static void main(String[] args) {
        Student student1 = new Student();
        student1.setAverageMark(5);
        Aspirant aspirant = new Aspirant();
        aspirant.setAverageMark(5);
        Student student2 = new Student();
        student2.setAverageMark(4);
        Student[] students = {student1, aspirant, student2};
        System.out.println(students[0].getScholarship());
        System.out.println(students[1].getScholarship());
        System.out.println(students[2].getScholarship());
    }
}
