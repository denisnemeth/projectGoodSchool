package sk.itsovy;

import java.util.ArrayList;
import java.util.List;

public class School implements Interface1 {
    private List<Student> list;
    public School() {
        list = new ArrayList<>();
    }
}
