public class EmployeeService {

    public static void printSumSalary(Employee[] employees) {
        int sum = 0;
        for (Employee employee : employees) {
            if (employee != null)
                sum += employee.getSalary();
        }
        System.out.println("Общая сумма оплаты " + sum);
    }

    public static void printMaxSalary(Employee[] employees) {
        int maxSum = employees[0].getSalary();
        for (Employee employee : employees) {
            if (employee != null) {
                if (employee.getSalary() > maxSum) {
                    maxSum = employee.getSalary();
                }
            }
        }
        System.out.println("Максимальная сумма оплаты труда " + maxSum );
    }

    public static void printMinSalary(Employee[] employees) {
        int minSum = employees[0].getSalary();
        for (Employee employee : employees) {
            if (employee != null) {
                if (employee.getSalary() < minSum) {
                    minSum = employee.getSalary();
                }
            }
        }
        System.out.println("Минимальная сумма оплаты труда " + minSum );
    }
    public static void printAverageSalary(Employee[] employees) {
        int sum = 0;
        int count = 0;
        for (Employee employee : employees) {
            if (employee != null)
                sum += employee.getSalary();
            count++;
        }
        System.out.println("Cредняя оплата труда " + sum/count);
    }

    public static void print(Employee[] employees) {
        for (Employee employee : employees) {
            if (employee != null)
                System.out.println(employee.getEmployeeName());
        }
    }

    public static void printAllInfo(Employee[] employee) {
        for (Employee employeeName : employee) {
            if (employee != null)
                System.out.println(employee);
        }
    }
}
















