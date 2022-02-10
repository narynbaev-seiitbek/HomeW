package HW16;

public class Circle {
    static int radius = 3;

    static void area() {
        double area = Math.PI * (radius * radius);
        System.out.println("The area of circle is: " + area);
    }
    static void circumference() {
        double circumference= Math.PI * 2*radius;
        System.out.println( "The circumference of the circle is: "+circumference);
    }


}
