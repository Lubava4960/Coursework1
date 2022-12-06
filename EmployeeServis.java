import j

public class  EmployeeServis {
    public Employee[] employee = new Employee[10];

    public int newSum(Employee[] employee) {
        int sum = 0;

        for (int i = 0; i < employees.length; i++) {
            if (Employee[i] != null)
                sum += employees[i].getSalary();
        }
        return sum;
        System.out.println("Общая сумма оплаты" + newSum);

        int maxSum = employee[0];
        for (int i = 0; i < employee.length; i++) {

            for (int i = 0; i < employee.length; i++) {
                if (employee[i] != null) {
                    int maxSum1 = employee[i].getSalqary;
                    maxSum = employee[i].getSalary();
                    if (maxSum1 > maxSum) {
                        maxSum = maxSum1;
                    }

                }
            }
        }
        System.out.println(" Максимальная сумма оплаты труда " + maxSum );
        int minSum = employee[0];
        for (int i = 0; i < employee.length; i++) {
        }
        System.out.println("Mинимальная сумма зарплат составляет " + minSum );
    }
}