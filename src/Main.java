public class Main {
    public static void main(String[] args) {
        EmployeeBook employeeBook = new EmployeeBook();

        Employee ivan = new Employee("Иван", "Иванов", "Иванович", 45_000, 2);

        employeeBook.addEmployee("Петр", "Иванов", "Иванович", 35_000, 1);
        employeeBook.addEmployee(ivan);

        employeeBook.removeEmployee(1);
        employeeBook.changeSalary(ivan, 43_000);
        employeeBook.changeDepartment(ivan, 1);

        employeeBook.printEmployeesByDepartment();

        employeeBook.printAllEmployees();
        double totalSalaries = employeeBook.totalSalaries();
        System.out.printf("Сумма ЗП всех сотрудников за месяц: %.3f%n", totalSalaries);
        Employee employeeWithMinSalary = employeeBook.findEmployeeWithMinSalary();
        System.out.println("Сотрудник с минимальной ЗП: " + employeeWithMinSalary);
        Employee employeeWithMaxSalary = employeeBook.findEmployeeWithMaxSalary();
        System.out.println("Сотрудник с максимальной ЗП: " + employeeWithMaxSalary);
        double averageSalary = employeeBook.averageSalary();
        System.out.printf("Средняя ЗП всех сотрудников за месяц: %.3f%n", averageSalary);
        employeeBook.printFullNameEmployees();

        employeeBook.indexSalaries(10);
        System.out.println("После индексации");
        employeeBook.printAllEmployees();

        System.out.printf("Сотрудник с минимальной ЗП из %d отдела: %s%n", 1, employeeBook.findEmployeeWithMinSalaryFromDepartment(1));
        System.out.printf("Сотрудник с максимальной ЗП из %d отдела: %s%n", 2, employeeBook.findEmployeeWithMaxSalaryFromDepartment(2));
        System.out.printf("Сумма ЗП всех сотрудников за месяц из отдела %d: %.2f%n", 3, employeeBook.totalSalariesForDepartment(3));
        System.out.printf("Средняя ЗП всех сотрудников за месяц из отдела %d: %.3f%n", 4, employeeBook.averageSalaryForDepartment(4));

        employeeBook.indexSalariesForDepartment(5, 1);
        System.out.println("После индексации для отдела " + 1);
        employeeBook.printAllEmployeesFromDepartment(1);
        employeeBook.printEmployeesWithSalaryLessThan(55_000);
        employeeBook.printEmployeesWithSalaryGreaterOrEqualThan(55_000);
    }
}