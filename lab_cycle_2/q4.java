class Student1 {
    String name;
    int age;

    Student1(String name, int age) {
        this.name = name;
        this.age = age;
    }
}
class q4{
    public static void main(String[] args) {
        Student1 s = new Student1("Anu", 20);

        System.out.println("Student Name : " + s.name);
        System.out.println("Age : " + s.age);
    }
}