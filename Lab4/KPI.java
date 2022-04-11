package Lab4;

import java.util.ArrayList;
import java.util.Collections;
import java.util.stream.Collectors;
import Lab4.studentComparator.*;



public class KPI {

    private ArrayList<Student> _studentList = new ArrayList<Student>();


    public void addStudent(Student addedStudent)
    {
        _studentList.add(addedStudent);
    }

    public void sortByGrade()
    {
        Collections.sort(_studentList, new Grade());
    }

    public void sortByIndex()
    {
        Collections.sort(_studentList, new Index().reversed());
    }

    public String getStudentsInformation()
    {
        return _studentList.stream().map(Student::toString).collect(Collectors.joining(";\n"));
    }

}
