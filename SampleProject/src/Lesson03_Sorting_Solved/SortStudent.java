package Lesson03_Sorting_Solved;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class SortStudent {
    public static void main(String[] args) {
        List<Student> classC01_1020 = new ArrayList<>();
        classC01_1020.add(new Student("Pham Van A", 10, 1));
        classC01_1020.add(new Student("Hoang Van A", 9, 2));
        classC01_1020.add(new Student("Nguyen Van B", 5, 3));
        classC01_1020.add(new Student("Hoang Van C", 10, 4));
        classC01_1020.add(new Student("Nguyen Van A", 5, 5));
        classC01_1020.add(new Student("Hoang Van G", 4, 6));
        classC01_1020.add(new Student("Hoang Van H", 10, 7));
        classC01_1020.add(new Student("Hoang Van I", 2, 8));
        classC01_1020.add(new Student("Hoang Van G", 1, 9));
        classC01_1020.add(new Student("Hoang Van A", 7, 10));


        String task1 = "#1. Sắp xếp học sinh theo fullName, neu giống fullName thì ai nhiều tuổi hơn thì đứng trước: ";
        classC01_1020.sort(new Comparator<Student>() {
            @Override
            public int compare(Student after, Student before) {
                if(after.fullName.equals(before.fullName)){
                    if(before.age > after.age) return 1;
                    if(before.age < after.age) return -1;
                    return 0;
                }else{
                    return after.fullName.compareTo(before.fullName);
                }
            }
        });

        System.out.println(task1);
        for (int i = 0; i < classC01_1020.size(); i++) {
            System.out.println(i + ") " + classC01_1020.get(i));
        }

        String task2 = "\n\n#2. Sắp xếp học sinh theo tuổi tăng dần, nếu bằng tuổi thì xếp theo GPA giảm dần ";
        classC01_1020.sort(new Comparator<Student>() {
            @Override
            public int compare(Student after, Student before) {
                if(before.age < after.age) return 1;
                if(before.age > after.age) return -1;
                if(before.GPA > after.GPA) return 1;
                if(before.GPA < after.GPA) return -1;
                return 0;
            }
        });

        System.out.println(task2);
        for (int i = 0; i < classC01_1020.size(); i++) {
            System.out.println(i + ") " + classC01_1020.get(i));
        }


        String task3 = "\n\n#3. Sắp xếp theo tên";
        Collections.sort(classC01_1020);

        System.out.println(task3);
        for (int i = 0; i < classC01_1020.size(); i++) {
            System.out.println(i + ") " + classC01_1020.get(i));
        }
    }
}
