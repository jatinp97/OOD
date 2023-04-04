package edu.northeastern.csye6200;

public class Lab9P1 {
	public static void main(String[] args) {
		// TODO: write your code here
		
		Octagon octagon1 = new Octagon(9);
        System.out.println("Area is " + octagon1.getArea());
        System.out.println("Perimeter is " + octagon1.getPerimeter());

        Octagon octagon2 = octagon1.clone();
        System.out.println("Comparison result: " + octagon1.compareTo(octagon2));
	}
}

class Octagon extends GeometricObject implements Comparable<Octagon>, Cloneable {

	// TODO: write your code here
	
	private double side;
	
	public Octagon(double side) {
        this.side = side;
    }

    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        this.side = side;
    }

    @Override
    public double getArea() {
        return (2 + 4 / Math.sqrt(2)) * side * side;
    }

    @Override
    public double getPerimeter() {
        return 8 * side;
    }

    @Override
    public int compareTo(Octagon o) {
        if (this.getArea() > o.getArea()) {
            return 1;
        } else if (this.getArea() < o.getArea()) {
            return -1;
        } else {
            return 0;
        }
    }

    @Override
    public Octagon clone() {
        try {
            return (Octagon) super.clone();
        } catch (CloneNotSupportedException ex) {
            return null;
        }
    }
	

}
