class CircleArea {
    static final double PI = 3.14159;

    static double calculateArea(double radius) {
        return PI * radius * radius;
    }
}
class q20 {
    public static void main(String[] args) {
        double radius = 5;

        double area = CircleArea.calculateArea(radius);

        System.out.printf("Area = %.2f%n", area);
    }
}
