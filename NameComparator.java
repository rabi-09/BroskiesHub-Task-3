import java.util.Comparator;

public class NameComparator implements Comparator{

    @Override
    public int compare(Object o1, Object o2) {
        Employee e1=null, e2=null;
        if(o1 instanceof Employee && o2 instanceof Employee){
            e1 = (Employee)o1;
            e2 = (Employee)o2;
        }
        return e1.getName().compareTo(e2.getName());
    }
}
