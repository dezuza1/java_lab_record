class Animal1 {

    Animal1() {

        System.out.println("Animal Constructor");
    }
}

class Dog1 extends Animal1 {

    Dog1() {

        super();

        System.out.println("Dog Constructor");
    }
}

public class test1 {

    public static void main(String[] args) {

        Dog1 d = new Dog1();
    }
}