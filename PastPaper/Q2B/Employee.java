import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;

public class Employee {
    public static void main (String [] args){
        LinkedList <Employee1>list = new LinkedList<Employee1>();
        list.add(new Employee1 ("Alex",24000));
        list.add(new Employee1 ("Bhatti",46000));
       // System.out.println(list);
        Collections.sort(list);
       Collections.sort(list, new NameSort());
        for (Employee1 e : list) {
            System.out.println(e.Empname + " " + e.salary);
        }
    }
}