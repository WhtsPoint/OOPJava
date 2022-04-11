package Lab4;

import java.util.ArrayList;
import Lab4.KPI;
import Lab4.Student;

public class Lab4 {
    public static void main(String[] args) {

        ArrayList<Student> studentList = new ArrayList<Student>();

        studentList.add(new Student("Казак Вадим", "IO", 13,8,92));
        studentList.add(new Student("Васютинський Олександр", "IO", 13, 2, 95));
        studentList.add(new Student("Литвиненко Роман", "IO", 13,14,99));
        studentList.add(new Student("Гаджігасанлі Сахіл", "IO", 13, 3, 100));

        KPI myGroup = new KPI();

        for(Student eachStudent : studentList )
        {
            myGroup.addStudent(eachStudent);
        }

        System.out.print("Список до сортування:\n" + myGroup.getStudentsInformation());

        myGroup.sortByGrade();
        System.out.print("\n\nСписок після сортування за оцінками:\n" + myGroup.getStudentsInformation());

        myGroup.sortByIndex();
        System.out.print("\n\nСписок після сортування за номером у списку:\n" + myGroup.getStudentsInformation());


        // Спроба створити об'єкт з оцінкою, яка виходить за діапазон можливо. Отримаємо виключення

        new Student("Ясінський Любомир", "IO", 13,31,123);

    }
}
