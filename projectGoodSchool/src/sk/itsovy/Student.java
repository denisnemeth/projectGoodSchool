package sk.itsovy;

public class Student extends Person {
    private byte g_Mat;
    private byte g_Eng;
    private byte g_Int;
    private int absence;
    public Student(String firstName, String lastName, byte g_Mat, byte g_Eng, byte g_Int, int absence) {
        super(firstName, lastName);
        this.g_Mat = g_Mat;
        this.g_Eng = g_Eng;
        this.g_Int = g_Int;
        this.absence = absence;
    }
    public byte getG_Mat() {
        return g_Mat;
    }
    public byte getG_Eng() {
        return g_Eng;
    }
    public byte getG_Int() {
        return g_Int;
    }
    public double getAverageGrade() {
        return (double)(g_Mat+g_Eng+g_Int)/3;
    }
    public int getAbsence() {
        return absence;
    }
}
