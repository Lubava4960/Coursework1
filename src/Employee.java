import java.util.Objects;

public  class Employee {


    private int numberDepartment;
    private int salary;

    public   Employee (int numberDepartment, int salary) {
        this.numberDepartment = numberDepartment;
        this.salary = salary;

       // return numberDepartment;
       //return salary;
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
        public String toString () {
        return "Employee" + " " +
                numberDepartment + "" +
                salary;
    }


        @Override
        public boolean equals (Object o){
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Employee employee = (Employee) o;
        return numberDepartment == employee.numberDepartment && salary == employee.salary;
    }

        @Override
        public int hashCode () {

        return Objects.hash(numberDepartment, salary);
    }
    }
