

import java.lang.Math;


    //you can use Math.PI


public class AreaCalculator {
    public double calculate(double radius) {
        // calculate area of circle
        return radius * radius * Math.PI ; 
    }

    public double calculate(double width, double height) {
        return width * height ;
    }

    public double calculate(double base, double height, boolean isTriangle) {
        return ((base * height) /2);
    }

    public double calculate(double side, boolean isSquare) {

        return side * side ;
    }
}