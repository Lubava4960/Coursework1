import java.util.Objects;

public  class Employee {
    private static int count = 1;
    private final int id;
    private final EmployeeName employeeName;
    private int numberDepartment;
    private int salary;


    public Employee(EmployeeName employeeName, int id, int numberDepartment, int salary) {
        this.id = count++;
        this.employeeName = employeeName;
        this.numberDepartment = numberDepartment;
        this.salary = salary;
    }

    public static int getCount() {
        return count;
    }

    public int getId() {
        return id;
    }

    public EmployeeName getEmployeeName() {
        return employeeName;
    }

    public int getNumberDepartment() {
        return numberDepartment;
    }

    public int getSalary() {
        return salary;
    }

    public void setNumberDepartment(int numberDepartment) {
        this.numberDepartment = numberDepartment;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Employee employee = (Employee) o;
        return id == employee.id && numberDepartment == employee.numberDepartment && salary == employee.salary && Objects.equals(employeeName, employee.employeeName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, employeeName, numberDepartment, salary);
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", employeeName=" + employeeName +
                ", numberDepartment=" + numberDepartment +
                ", salary=" + salary +
                '}';
    }
}








