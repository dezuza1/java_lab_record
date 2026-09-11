class Employee {
    String name;
    double salary;

    Employee(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }
}
class q2 {
    public static void main(String[] args) {
        Employee e = new Employee("Rahul", 35000);

        System.out.println("Employee Name : " + e.name);
        System.out.println("Employee Salary : " + e.salary);
    }
}