class Student2 {
    String name;
    int age;

    // Default constructor
    Student2() {
        System.out.println("Default Constructor");
    }

    // Parameterized constructor
    Student2(String name, int age) {
        this();
        this.name = name;
        this.age = age;

        System.out.println("Parameterized Constructor");
    }
}
class q5{
    public static void main(String[] args) {
        Student2 s = new Student2("Manu", 21);

        System.out.println("Name : " + s.name);
        System.out.println("Age : " + s.age);
    }
}