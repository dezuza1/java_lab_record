class a{
    void display1(){
        System.out.println("Random");
    }
}
class b extends a{
    void display2(){
        System.out.println("Random1");
    }
}
class c extends b{
    void display(){
        System.out.println("Random2");
    }
}
public class main {
    public static void main(String[] args){
        c C = new c();
        C.display();
        C.display2();
        C.display1();
    }
}
