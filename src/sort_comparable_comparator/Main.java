package sort_comparable_comparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Student student = new Student("Tùng",30,"Hà Nội");
        Student student1 = new Student("Đạt",25,"Hồ Tây");
        Student student2 = new Student("Hoàng",23,"Hà Nội");
        List<Student> list = new ArrayList<>();
        list.add(student);
        list.add(student1);
        list.add(student2);
        Collections.sort(list);
        for (Student students : list
             ) {
            System.out.println(students);
        }
        AgeComparator ageComparator = new AgeComparator();
        Collections.sort(list,ageComparator);
        for (Student students: list
             ) {
            System.out.println(students);
        }
    }
}
