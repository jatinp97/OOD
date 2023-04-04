package edu.northeastern.csye6200;

/* Represents class LAB9P2 */
public class Lab9P2 {
    public static void main(String[] args) {
        /* Initializing array of GeometricObject consisting */
        GeometricObject[] geoShapes = new GeometricObject[5];
        geoShapes[0] = new Square(2);
        geoShapes[1] = new Circle(5);
        geoShapes[2] = new Square(5);
        geoShapes[3] = new Rectangle(3, 4);
        geoShapes[4] = new Square(4.5);

        for (int i = 0; i < geoShapes.length; i++) {
            /* Output Area */
            System.out.printf("Area is %.2f%n", geoShapes[i].getArea());

            /* Checking geoShapes[i] object is an instance of Colorable */
            if (geoShapes[i] instanceof Colorable) {
                ((Colorable)geoShapes[i]).howToColor();
            }
        }
    }
}

/* Colorable interface */
interface Colorable {
    /* howToColor method */
    // howToColor method used for how to color
    // returns void
    public abstract void howToColor();
}

/* Square class Extended GeometricObject class and Implementing Colorable interface */
class Square extends GeometricObject implements Colorable {
    // side data field
    private double side;

    /* Default Constructor */
    public Square() {
        this(1.0);
    }

    /* Constructor Square with a specified side */
    public Square(double side) {
        this.side = side;
    }

    // setSide method used to set side value of Square // set side value of square
    public void setSide(double side) {
        this.side = side;
    }

    // getSide method used to side value of Square // returns side value of square
    public double getSide() {
        return side;
    }

    /* Override the getArea() method defined in the GeometricObject class*/
    // getArea method used to area of Square
    // returns area value square
    @Override
    public double getArea() {
        return Math.pow(side, 2);
    }

    /* Override the getPerimeter() method defined in the GeometricObject class */
    // getPerimeter method used to perimeter of Square
    // returns perimeter value square
    @Override
    public double getPerimeter() {
        return side * 4;
    }

    /* Implement the howToColor() method defined in the Colorable interface */
    // howToColor method used for how to color
    // returns void
    @Override
    public void howToColor() {
        System.out.println("Color all four sides");
    }
}
