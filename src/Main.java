public class Main {
    private static final Employee[] employees = new Employee[10];
    private static void printEmployees() {
        for (Employee employee : employees) {
            if (employee != null) {
                System.out.println(employee);
            }
        }
    }
    private static void printSum() {
        double sum = 0;
        for (Employee employee : employees) {
            if (employee != null) {
                sum += employee.getSalary();
            }
        }
        System.out.println("Salary sum: " + sum);
    }
    private static void printEmployeeWithMinSalary() {
        double min = Double.MAX_VALUE;
        Employee employeeWithMinSalary = null;
        for (Employee employee : employees) {
            if (employee != null && employee.getSalary() < min) {
                min = employee.getSalary();
                employeeWithMinSalary = employee;
            }
        }
        System.out.println("Employee with min salary: " + employeeWithMinSalary);
    }
    private static void printEmployeeWithMaxSalary() {
        double max = Double.MIN_VALUE;
        Employee employeeWithMaxSalary = null;
        for (Employee employee : employees) {
            if (employee != null && employee.getSalary() > max) {
                max = employee.getSalary();
                employeeWithMaxSalary = employee;
            }
        }
        System.out.println("Employee with max salary: " + employeeWithMaxSalary);
    }
    private static void printSalaryAverage() {
        double sum = 0;
        int count = 0;
        for (Employee employee : employees) {
            if (employee != null) {
                sum += employee.getSalary();
                count++;
            }
        }
        System.out.println("Average salary: " + sum/count);
    }
    private static void printNames() {
        for (Employee employee : employees) {
            if (employee != null) {
                System.out.println(employee.getFullName());
            }
        }
    }
    public static void main(String[] args) {
        employees[0] = new Employee("Иванов Иван Иванович", 1, 40_000);
        employees[1] = new Employee("Петров Петр Петрович", 2, 35_000);
        employees[2] = new Employee("Семенов Семен Семенович", 3, 55_000);
        employees[3] = new Employee("Алексеев Алексей Алексеевич", 4, 70_000);
        employees[4] = new Employee("Викторов Виктор Викторович", 5, 90_000);
        printEmployees();
        printSum();
        printEmployeeWithMinSalary();
        printEmployeeWithMaxSalary();
        printSalaryAverage();
        printNames();
    }
}