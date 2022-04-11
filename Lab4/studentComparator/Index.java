package Lab4.studentComparator;


import Lab4.Student;
import java.util.Comparator;

public class Index implements Comparator<Student> {

    public int compare(Student first, Student second) {
        if(first.getIndex() < second.getIndex())
            return 1;
        else if(first.getIndex() > second.getIndex())
            return -1;
        else
            return 0;
    }
}
