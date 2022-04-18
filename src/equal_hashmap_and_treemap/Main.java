package equal_hashmap_and_treemap;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Student student = new Student("Tùng",29,"Hà Nội");
        Student student1 = new Student("Đạt",25,"Hồ Tây");
        Student student2 = new Student("Hoàng",23,"Hà Nội");
        Map<Integer,Student> studentMap = new HashMap<>();
        studentMap.put(1,student);
        studentMap.put(2,student1);
        studentMap.put(3,student2);
        studentMap.put(4,student);
        for (Map.Entry<Integer,Student> students: studentMap.entrySet())
              {
                  System.out.println(students);
        }
        Set<Student> students = new HashSet<>();
        students.add(student);
        students.add(student1);
        students.add(student2);
        students.add(student);
        for (Student studentss: students
             ) {
            System.out.println(studentss);
        }
    }
}
