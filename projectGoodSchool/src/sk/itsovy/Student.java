package sk.itsovy;

public class Student {
    private String firstName;
    private String lastName;
    private int[] grades;
    private int absence;
    private int count = 0;

    public Student(String firstName, String lastName, int[] grades, int absence) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.grades = grades;
        this.absence = absence;
        count++;
    }

    public void addStudent() {
        count++;
    }
}
