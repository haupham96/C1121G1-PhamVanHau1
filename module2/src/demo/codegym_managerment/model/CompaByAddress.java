package ss6_inheritance.codegym_managerment.model;

import java.util.Comparator;

public class CompaByAddress implements Comparator<Student> {
    @Override
    public int compare(Student o1, Student o2) {
        return o1.address.compareTo(o2.address);
    }

}
