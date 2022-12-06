import java.util.Objects;

public class EmployeeName {
    private final int id;
    private static int count = 1;

    private String firstName;
    private String middleName;
    private String lastName;

    private Employee employee;


private int numberDepartment;
private int salary;

    public EmployeeName(int id, String firstName, String middleName, String lastName, int numberDepartment, int salary) {

        this.id = count++;
        this.firstName = firstName;
        this.middleName = middleName;
        this.lastName = lastName;
        this.numberDepartment = 1;
        this.salary = 1;

    }

    public Employee getEmployee() {
        return employee;
    }

    public void setEmployee(Employee employee) {
        this.employee = employee;
    }

    public String getFirstName() {

        return firstName;
    }

    public void setFirstName(String firstName) {

        this.firstName = firstName;
    }

    public String getMiddleName() {

        return middleName;
    }

    public void setMiddleName(String middleName) {

        this.middleName = middleName;
    }

    public String getLastName() {

        return lastName;
    }

    public void setLastName(String lastName) {

        this.lastName = lastName;
    }

    public int getNumberDepartment() {

     return numberDepartment;
     }

     public void setNumberDepartment(int numberDepartment) {

    this.numberDepartment = numberDepartment;
    }

    public int getSalary() {

     return salary;
    }

     public void setSalary(int salary) {
    this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee:" + "личный номер- " + id + " " +  firstName +
                " " + middleName +
                " " + lastName + " " +employee;

    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        EmployeeName that = (EmployeeName) o;
        return id == that.id && Objects.equals(firstName, that.firstName) && Objects.equals(middleName, that.middleName) && Objects.equals(lastName, that.lastName) && Objects.equals(employee, that.employee);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, firstName, middleName, lastName, employee);
    }
}
