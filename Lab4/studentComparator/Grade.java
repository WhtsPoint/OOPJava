package Lab4.studentComparator;

import Lab4.Student;
import java.util.Comparator;

public class Grade implements Comparator<Student> {

    public int compare(Student first, Student second) {
        if(first.getGrade() < second.getGrade())
            return 1;
         else if(first.getGrade() > second.getGrade())
            return -1;
         else
             return 0;
    }
}
