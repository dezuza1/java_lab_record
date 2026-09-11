class Animal2 {

    String name = "Animal";
}

class Dog2 extends Animal2 {

    String name = "Dog";

    void display() {

        System.out.println(name);

        System.out.println(super.name);
    }
}

public class test2 {

    public static void main(String[] args) {

        Dog2 d = new Dog2();

        d.display();
    }
}