public class Main {

   public static void main(String[] args) {

      EmployeeName employeeName1 = new EmployeeName("Марина", "Алексеевна", "Пилатова");
      EmployeeName employeeName2 = new EmployeeName("Наталья", "Игоревна", "Леонова");
      EmployeeName employeeName3 = new EmployeeName("Вера", "Вячеславовна", "Зибрина");
      EmployeeName employeeName4 = new EmployeeName("Ольга", "Владиславовна", "Горюнова");
      EmployeeName employeeName5 = new EmployeeName("Ольга", "Владимировна", "Артемьева");
      EmployeeName employeeName6 = new EmployeeName("Марина", "Ивановна", "Кулькова");
      EmployeeName employeeName7 = new EmployeeName("Ирина", "Алексеевна", "Зайцева");
      EmployeeName employeeName8 = new EmployeeName("Юрий", "Иванович", "Демидов");
      EmployeeName employeeName9 = new EmployeeName("Роман", "Юрьевич", "Албаев");
      EmployeeName employeeName10 = new EmployeeName("Малика", "Мадиновна", "Шерматова");
      Employee[] employees = new Employee[]{
              new Employee(employeeName1, 1, 1, 100000),
              new Employee(employeeName2, 2, 1, 80000),
              new Employee(employeeName3, 3, 2, 81000),
              new Employee(employeeName4, 4, 2, 75000),
              new Employee(employeeName5, 5, 3, 70000),
              new Employee(employeeName6, 6, 3, 68000),
              new Employee(employeeName7, 7, 4, 60000),
              new Employee(employeeName8, 8, 4, 59000),
              new Employee(employeeName9, 9, 5, 58000),
              new Employee(employeeName10, 10, 5, 45000)};

      System.out.println(employees);
      // printAllInfo(employees);
      // printSumSalary(employees);
       //printMaxSalary(employees);
       //printMinSalary(employees);
       //printMinSalary(employees);
       printAverageSalary(employees);
   }

   private static void printAverageSalary(Employee[] employees) {
   }
}

