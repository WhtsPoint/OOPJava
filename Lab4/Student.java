package Lab4;

public class Student {
    private String _fullName;
    private String _faculty;
    private int _group;
    private int _index;
    private int _grade;


    public Student(String fullName, String faculty, int group, int index, int grade) {
        this._fullName = fullName;
        this._faculty = faculty;
        this._group = group;
        this._index = index;
        _setGrade(grade);
    }

    public String getName() {
        return _fullName;
    }

    public int getGroup()
    {
        return _group;
    }

    public int getIndex()
    {
        return _index;
    }

    public String getPosition() {
        return getGroup() + "-" + getGrade();
    }

    public String getFaculty() {
        return _faculty;
    }

    public int getGrade() {
        return _grade;
    }

    @Override
    public String toString()
    {
        String studentInformation = "%s Факультет: %s, Група: %s, Номер за списком: %s, Оцінка: %d ";
        return String.format(studentInformation, getName(), getFaculty(), getPosition(), getIndex(), getGrade());
    }

    private void _setGrade(int grade) {
        if(grade >= 0 && grade <= 100) {
            this._grade = grade;
        } else {
            throw new IllegalArgumentException("Student`s grade must be between 1 and 100");
        }
    }


}
