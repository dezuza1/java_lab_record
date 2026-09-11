class Student4 {
    String name;
    int mark;

    Student4(String name, int mark) {
        this.name = name;
        this.mark = mark;
    }

    static Student4 getStudent() {
        return new Student4("Arun", 87);
    }
}
class q12 {
    public static void main(String[] args) {
        Student4 s = Student4.getStudent();

        System.out.println("Student Name : " + s.name);
        System.out.println("Mark : " + s.mark);
    }
}