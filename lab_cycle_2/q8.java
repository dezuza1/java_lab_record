class DisplayDemo {

    void display(int num) {
        System.out.println("Integer : " + num);
    }

    void display(double num) {
        System.out.println("Double : " + num);
    }

    void display(String text) {
        System.out.println("String : " + text);
    }
}
class q8{
    public static void main(String[] args) {
        DisplayDemo d = new DisplayDemo();

        d.display(10);
        d.display(25.6);
        d.display("Java");
    }
}