package edu.northeastern.csye6200;
/*Rectangle class Extended Geomentric object class */
public class Rectangle extends GeometricObject {
	// width data field
	private double width; 
	// height data field
	private double height;
       
	/* Default Constructor */
	public Rectangle() { 
		this(1.0,1.0);
	}
    /* Constructor Rectangle with a specified width and height */
	public Rectangle(double width,double height) { 
		this.width = width;
		this.height = height;
	}
// getSide method used to side value of rectangle // returns side value of rectangle
	public double getWidth() {
		return width;
	}
// setWidth method used to set side value of rectangle // set width value of rectangle
	public void setWidth(double width) {
		this.width = width;
	}
// getHeight method used to side value of rectangle // returns height value of rectangle
	public double getHeight() {
		return height;
	}
// setHeight method used to set side value of rectangle // set height value of rectangle
	public void setHeight(double height) {
		this.height = height;
	}
		
/* Override the getArea() method defined in the GeometricObject class*/
       // getArea method used to area  of rectangle
       // returns area value rectangle
   @Override
   public double getArea() {
	   return width * height;
   	}
  /* Override the getPerimeter() method defined in the GeometricObjecT class*/

   @Override
public double getPerimeter() {
	   return 2 *(width + height);
   } 
 }