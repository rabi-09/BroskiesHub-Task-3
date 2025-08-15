import java.util.Comparator;

public class SalaryComparator implements Comparator<Employee>{

    @Override
    public int compare(Employee e1, Employee e2) {
        return Integer.compare(e2.getSalary(), e1.getSalary());
    }
    
}
