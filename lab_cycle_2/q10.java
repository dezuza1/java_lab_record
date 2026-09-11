class Student3 {
    String name;
    int rollNo;

    Student3(String name, int rollNo) {
        this.name = name;
        this.rollNo = rollNo;
    }

    void display(Student3 s) {
        System.out.println("Student Name : " + s.name);
        System.out.println("Roll No : " + s.rollNo);
    }
}
class q10{
    public static void main(String[] args) {
        Student3 s = new Student3("Neha", 25);
        s.display(s);
    }
}