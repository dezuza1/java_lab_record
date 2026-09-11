class Employee{
    void calculateSalary(){

    }
}

class Manager extends Employee{
    void calculateSalary(){
        System.out.println("Calculating Salary of Manager");
    }
}
class Developer extends Employee{
    void calculateSalary(){
        System.out.println("Calculating Salary of Developer");
    }
}
class Intern extends Employee{
    void calculateSalary(){
        System.out.println("Calculating Salary of Intern");
    }
}

public class empsalary {
    public static void main(String[] args){
    Employee emp;

    emp = new Manager();
    emp.calculateSalary();

    emp = new Developer();
    emp.calculateSalary();

    emp = new Intern();
    emp.calculateSalary();

    }
}
