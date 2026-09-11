class Calculator{
    public int add(int a,int b){
        return a+b;
    }
    public double add(double a,double b){
        return a+b;
    }
    public long add(long a,long b){
        return a+b;
    }
}

public class DemoCalc {
    public static void main(String[] args){
        Calculator c = new Calculator();
        System.out.println(c.add(1,2));
        System.out.println(c.add(1.1,2.2));
        System.out.println(c.add(10000,20000));
    }
}

