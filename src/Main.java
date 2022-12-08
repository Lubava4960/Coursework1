import java.util.Objects;

public class Main {
    public static void main(String[] args) {

        EmployeeName employeeName1 = new EmployeeName("Марина", "Алексеевна", "Пилатова");
        EmployeeName employeeName2 = new EmployeeName("Наталья", "Игоревна", "Леонова");
        EmployeeName employeeName3 = new EmployeeName("Вера", "Вячеславовна", "Зибрина");
        EmployeeName employeeName4 = new EmployeeName( "Ольга", "Владиславовна", "Горюнова");
        EmployeeName employeeName5 = new EmployeeName( "Ольга", "Владимировна", "Артемьева");
        EmployeeName employeeName6 = new EmployeeName( "Марина", "Ивановна", "Кулькова");
        EmployeeName employeeName7 = new EmployeeName( "Ирина", "Алексеевна", "Зайцева");
        EmployeeName employeeName8 = new EmployeeName( "Юрий", "Иванович", "Демидов" );
        EmployeeName employeeName9 = new EmployeeName( "Роман", "Юрьевич", "Албаев");
        EmployeeName employeeName10 = new EmployeeName( "Малика", "Мадиновна", "Шерматова");

        Employee[] employees = new Employee[]{
                new Employee(1, employeeName1, 1,100000),
                new Employee(2, employeeName2, 1, 90000),
                new Employee(3, employeeName3, 2, 80000),
                new Employee(3, employeeName4, 2, 83000),
                new Employee(5, employeeName5, 3, 75000),
                new Employee(6,employeeName6, 3, 85000),
                new Employee(7, employeeName7,4, 86000),
                new Employee(8, employeeName8, 4, 53000),
                new Employee(9, employeeName9, 5, 56000),
                new Employee(10, employeeName10, 5, 63000)};
                 // printAllInfo(employees);
                //printFIO(employees);
               // printSumSalary(employees);
               // printMaxSalary(employees);
               // printMinSalary(employees);
                //printAverageSalary(employees);


    }


}