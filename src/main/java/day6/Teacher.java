package day6;

import java.util.Random;

public class Teacher {
    private String name;
    private String subject;


    public Teacher(String name, String subject) {
        this.name = name;
        this.subject = subject;
    }

    public void setName(String username) {
        name = username;
    }

    public String getName() {
        return name;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public void evaluate(Student student) {
        Random random = new Random();
        int a = 2;
        int b = 5;
        int grade = a + random.nextInt(b - a + 1);
        String s = "";
        switch (grade) {
            case 2:
                s = "неудовлетворительно";
                break;
            case 3:
                s = "удовлетворительно";
                break;
            case 4:
                s = "хорошо";
                break;
            default:
                s = "отлично";
                break;
        }
        System.out.println("Преподаватель" + " " + getName() + " " + "оценил студента" + " "
                + "с именем" + " " + student.name + " " + "по предмету" + " " + subject + " " + "на оценку" + " " + s);
    }
}