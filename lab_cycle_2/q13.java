class Circle {
    double radius;
    double area;

    Circle(double radius) {
        this.radius = radius;
        this.area = Math.PI * radius * radius;
    }

    static Circle calculateArea(double radius) {
        return new Circle(radius);
    }
}
class q13 {
    public static void main(String[] args) {
        Circle c = Circle.calculateArea(7);

        System.out.printf("Radius = %.1f%n", c.radius);
        System.out.printf("Area = %.2f%n", c.area);
    }
}