package Lab4;

public class StudentCreator {

    public Student create(String fullName, String faculty, String group, int index, int grade) {

        if(index <= 0) throw new IllegalArgumentException("Student`s index must be only natural number");
        if(grade < 0 || grade > 100) throw new IllegalArgumentException("Student`s grade must be between 1 and 100");

        return new Student(fullName, faculty, group, index, grade);
    }

}
