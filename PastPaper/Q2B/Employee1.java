import java.util.Comparator;
import java.util.Comparator;

public class Employee1 implements Comparable<Employee1> {
    String Empname;
    int salary;
    Employee1(String Empname, int salary){
        this.Empname = Empname;
        this.salary= salary;

    }

    @Override
    public int compareTo(Employee1 o) {
        return this.salary - o.salary;
    }
}

class NameSort implements Comparator<Employee1> {
    @Override
    public int compare(Employee1 a, Employee1 b) {
        return a.salary - b.salary;
    }

}

