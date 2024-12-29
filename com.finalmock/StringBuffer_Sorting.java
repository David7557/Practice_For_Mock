import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class StringBuffer_Sorting{
    public static void main(String[] args){
        ArrayList<Student> lists = new ArrayList<>();
        lists.add(new Student("David", 22));
        lists.add(new Student("Sumit", 21));
        lists.add(new Student("Jyoti", 23));
        lists.add(new Student("Kartik", 20));

        Collections.sort(lists, new NameComparator());

        for (Student student : lists) {
            System.out.println(student);
        }
    }
}

class Student {
    String name;
    int age;

    Student(String name, int age){
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString(){
        return "Name "+name+" Age "+age;
    }
    
}

class NameComparator implements Comparator<Student> {
    @Override
    public int compare(Student s1, Student s2){
        StringBuffer name1 = new StringBuffer(s1.name);
        StringBuffer name2 = new StringBuffer(s2.name);

        return name1.compareTo(name2);
    }
}