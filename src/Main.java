public class Main {

   public static void main(String[] args) {
      Employee[] employees = new Employee[]{
       new Employee(1,  150000),
       new Employee(1, 100000),
       new Employee(2, 80000),
       new Employee(2, 75000),
       new Employee(3, 70000),
       new Employee(3, 68000),
       new Employee(4, 60000),
       new Employee(4, 59000),
      new Employee(5, 58000),
      new Employee(5, 45000)};

      EmployeeName employeeName1 = new EmployeeName(1, "Марина", "Алексеевна", "Пилатова", 1,150000);
      EmployeeName employeeName2 = new EmployeeName(2, "Наталья", "Игоревна", "Леонова", 1,100000);
      EmployeeName employeeName3 = new EmployeeName(3, "Вера", "Вячеславовна", "Зибрина",2,80000);
      EmployeeName employeeName4 = new EmployeeName(4, "Ольга", "Владиславовна", "Горюнова",2,75000);
      EmployeeName employeeName5 = new EmployeeName(5, "Ольга", "Владимировна", "Артемьева", 3,70000);
      EmployeeName employeeName6 = new EmployeeName(6, "Марина", "Ивановна", "Кулькова", 3,68000);
      EmployeeName employeeName7 = new EmployeeName(7, "Ирина", "Алексеевна", "Зайцева", 4,60000);
      EmployeeName employeeName8 = new EmployeeName(8, "Юрий", "Иванович", "Демидов", 4,59000);
      EmployeeName employeeName9 = new EmployeeName(9, "Роман", "Юрьевич", "Албаев", 5,5800);
      EmployeeName employeeName10 = new EmployeeName(10, "Малика", "Мадиновна", "Шерматова",5,45000);
      EmployeeName[] staff = new EmployeeName[10];
      staff[0] = employeeName1;
      staff[1] = employeeName2;
      staff[2] = employeeName3;
      staff[3] = employeeName4;
      staff[4] = employeeName5;
      staff[5] = employeeName6;
      staff[6] = employeeName7;
      staff[7] = employeeName8;
      staff[8] = employeeName9;
      staff[9] = employeeName10;
      for (EmployeeName employeeName : staff)
         System.out.println(employeeName);

     // for (int i  = 0; i < 10;i++) {

     // }
      //System.out.println(Employee.getClass());

      //System.out.println(Employee.employeeName(employeeName));


   }
}