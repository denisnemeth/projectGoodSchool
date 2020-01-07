package sk.itsovy;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Student extends Person {
    private byte g_Mat;
    private byte g_Eng;
    private byte g_Inf;
    private int absence;
    public Student(String firstName, String lastName, byte g_Mat, byte g_Eng, byte g_Inf, int absence) {
        super(firstName, lastName);
        this.g_Mat = g_Mat;
        this.g_Eng = g_Eng;
        this.g_Inf = g_Inf;
        this.absence = absence;
    }
    public Student() {
        super();
        try{
            BufferedReader myReader = new BufferedReader(new FileReader("student.dat"));
            int pos = 0;
            StringBuffer data = new StringBuffer();
            while(myReader.ready()) {
                char c = (char) myReader.read();
                if(c == '\n') {
                    pos = 0;
                }
                if(c != ' ') {
                    data.append(c);
                } else {
                    switch(pos) {
                        case 0: ;
                        case 1: ;
                        case 2: g_Mat = Byte.parseByte(data.toString());
                        case 3: g_Eng = Byte.parseByte(data.toString());
                        case 4: g_Inf = Byte.parseByte(data.toString());
                        case 5: absence = Integer.parseInt(data.toString());
                    }
                    data.delete(0,data.length());
                    pos++;
                }
            }
        } catch(IOException e){
            e.printStackTrace();
        }
    }
    public byte getG_Mat() {
        return g_Mat;
    }
    public byte getG_Eng() {
        return g_Eng;
    }
    public byte getG_Inf() {
        return g_Inf;
    }
    public double getAverageGrade() {
        return (double)(g_Mat+g_Eng+g_Inf)/3;
    }
    public int getAbsence() {
        return absence;
    }
}