package day6;

public class Task3 {
    public static void main(String[] args) {
        Teacher teacher = new Teacher("Иванов", "математика");
        Student student = new Student("Петров");
        student.setName("Петров");
        teacher.evaluate(student);

    }
}
