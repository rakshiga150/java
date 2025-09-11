abstract class Shape {
    int a, b;

    Shape(int a, int b) {
        this.a = a;
        this.b = b;
    }

    abstract void printArea();
}

class Rectangle extends Shape {
    Rectangle(int a, int b) {
        super(a, b);
    }
    void printArea() {
        System.out.println("Area of rectangle: " + (a * b));
    }
}

class Triangle extends Shape {
    Triangle(int a, int b) {
        super(a, b);
    }


    void printArea() {
        System.out.println("Area of triangle: " + (0.5 * a * b));
    }
}

class Circle extends Shape {
    Circle(int a) {
        super(a, 0);
    }

    void printArea() {
        System.out.println("Area of circle: " + (3.14 * a * a));
    }
}

class Sample {
    public static void main(String[] args) {
        Shape rect = new Rectangle(5, 10);
        rect.printArea();

        Shape tri = new Triangle(6, 8);
        tri.printArea();

        Shape cir = new Circle(7);
        cir.printArea();
    }
}