import java.util.ArrayList;
import java.util.Collections;


public class Main {
    public static void main(String[] args) {
        ArrayList<Employee> employees = new ArrayList<>();
        employees.add(new Employee("Rabi", 20, 10000));
        employees.add(new Employee("Pratik", 21, 20000));
        employees.add(new Employee("Smruti", 19, 5000));
        employees.add(new Employee("Satya", 22, 50000));

        //Default Print
        System.out.println("Unordered Employee List:");
        for (Employee employee : employees) {
            System.out.println(employee);
        }
        System.out.println("\n");
        
        //Desc Sorted Print for Salary
        Collections.sort(employees, new SalaryComparator());
        System.out.println("Desc Sorted Employee List by Salary:");
        for (Employee employee : employees) {
            System.out.println(employee);
        }
        System.out.println("\n");
        
        //Asc Sorted Print for Name
        Collections.sort(employees, new NameComparator());
        System.out.println("Asc Sorted Employee List by Name:");
        for (Employee employee : employees) {
            System.out.println(employee);
        }
    }
}
