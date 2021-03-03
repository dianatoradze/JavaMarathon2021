package day9.Task1;

public class Task1 {
    public static void main(String[] args) {
        Teacher teacher = new Teacher("Иванов", "математика");
        Student student = new Student("Петров", "А-123");
        teacher.printInfo();
        student.printInfo();
    }
}
