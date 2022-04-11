package Lab4;

import java.util.ArrayList;

public class Lab4 {
    public static void main(String[] args) {

        ArrayList<Student> studentList = new ArrayList<Student>();

        StudentCreator receiver = new StudentCreator();
        
        studentList.add(receiver.create("Казак Вадим", "FICT", "IO13",8,92));
        studentList.add(receiver.create("Васютинський Олександр", "FICT", "IO13", 2, 95));
        studentList.add(receiver.create("Литвиненко Роман", "FICT", "IO13",14,99));
        studentList.add(receiver.create("Гаджігасанлі Сахіл", "FICT", "IO13", 3, 100));

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

        receiver.create("Ясінський Любомир", "IO", "IO13",31,123);

    }
}
