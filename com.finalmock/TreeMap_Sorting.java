import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.Comparator;

public class TreeMap_Sorting {
    public static void main(String[] args) {
        Map<Student1, Employee1> map = new TreeMap<>(new StudentIdComparator());
        map.put(new Student1(101, "David"), new Employee1(101, "David"));
        map.put(new Student1(100, "Rama"), new Employee1(100, "Rama"));

        Set<Student1> set = map.keySet();

        for(Student1 s: set){
            System.out.println(s+" ---> "+map.get(s));
        }

    }
}

class Student1 {
    int id;
    String name;

    Student1(int id, String name) {
        this.id = id;
        this.name = name;
    }

}

class Employee1 {
    int id;
    String name;

    Employee1(int id, String name) {
        this.id = id;
        this.name = name;
    }

    @Override
    public String toString(){
        return "Name: "+name+" Id: "+id;
    }

}

class StudentIdComparator implements Comparator<Student1> {
    @Override
    public int compare(Student1 s1, Student1 s2){
        return s1.id - s2.id;
    }
}
