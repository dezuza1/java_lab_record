class Student5 {
    private String name;
    private int age;

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
}
class q17 {
    public static void main(String[] args) {
        Student5 s = new Student5();

        s.setName("Maya");
        s.setAge(19);

        System.out.println("Student Name : " + s.getName());
        System.out.println("Age : " + s.getAge());
    }
}
