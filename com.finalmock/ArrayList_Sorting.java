import java.util.ArrayList;
import java.util.Comparator;
import java.util.Collections;

public class ArrayList_Sorting {
    public static void main(String[] args){
        ArrayList<Person> list = new ArrayList<>();
        list.add(new Student(102, "David"));
        list.add(new Student(104, "Rakesh"));
        list.add(new Student(106, "Chatur"));
        list.add(new Employee(101, "Ravi"));
        list.add(new Employee(103, "Raghav"));
        list.add(new Employee(105, "Rajesh"));

        Collections.sort(list, new IdComparator());
        for (Person p : list) {
           if(p instanceof Student){
            Student s = (Student) p;
            System.out.println(s);
           }else{
            Employee e = (Employee) p;
            System.out.println(e);
           }
            
        }
    }
}

class Person {
    int id;
    String name;

    Person(int id, String name){
        this.id = id;
        this.name = name;
    }
}
class Student extends Person {

    Student(int id, String name){
       super(id, name);
    }

    @Override
    public String toString(){
        return "Id: "+id+" Name: "+name;
    }
}

class Employee extends Person {
    
    Employee(int id, String name){
        super(id, name);
    }

    @Override
    public String toString(){
        return "Id: "+id+" Name: "+name;
    }
}

class IdComparator implements Comparator<Person> {
    @Override
    public int compare(Person p1, Person p2){
        return p1.id - p2.id;
    }
}

