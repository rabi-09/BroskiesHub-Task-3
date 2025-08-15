public class Employee {
    private String name;
    private int age, salary;

    public Employee(String name, int age, int salary) {
        this.name = name;
        this.age = age;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }
    public int getAge() {
        return age;
    }
    public int getSalary() {
        return salary;
    }

    @Override
    public String toString() {
        return "Employee Name: " + getName() + ", Age: " + getAge() + ", Salary: " + getSalary();
    }
    
}
