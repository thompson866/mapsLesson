public class Employee {

    private static int counter = 1;

    private final String name;
    private final String surname;
    private final String patronymicName;
    private double salary;
    private int department;
    private final int id;

    public Employee(String name, String surname, String patronymicName, double salary, int department) {
        this.id = counter++;
        this.name = name;
        this.surname = surname;
        this.patronymicName = patronymicName;
        this.salary = salary;
        this.department = department;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public void setDepartment(int department) {
        this.department = department;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public String getPatronymicName() {
        return patronymicName;
    }

    public double getSalary() {
        return salary;
    }

    public int getDepartment() {
        return department;
    }

    public int getId() {
        return id;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Employee employee = (Employee) o;
        return name.equals(employee.name) && surname.equals(employee.surname) && patronymicName.equals(employee.patronymicName);
    }


    @Override
    public String toString() {
        return String.format(
                "id: %d, ФИО: %s %s %s, ЗП: %.2f, № отдела: %d",
                id,
                surname,
                name,
                patronymicName,
                salary,
                department
        );
    }

}
