/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package shapes;

/**
 *
 * @author joese
 */
public class Rectangle {

    private double Length;
    private double Width;
    private double area;
    private double perimeter;
 
   
    

    public Rectangle() {
        this.Length = 1.0;
        this.Width = 1.0;
    }

    public Rectangle(double side) {
        this.setLength(side);
        this.setWidth(side);
    }

    public Rectangle(double length, double width) {
        this.setLength(length);
        this.setWidth(width);
    }

    public double getLength() {
        return Length;
    }

    public void setLength(double length) {
        this.Length = Length;
        this.setArea();
        this.setPerimeter();
    }

    public double getWidth() {
        return Width;
    }

    public void setWidth(double width) {
        this.Width = Width;
        this.setArea();
        this.setPerimeter();
    }

    private void setArea() {
        this.area = this.Width * this.Length;
    }

    private void setPerimeter() {
        this.perimeter = this.Width * 2 + this.Length * 2;

    }

    public double getArea() {
        return area;
    }

    public double getPerimeter() {
        return perimeter;
    }

   
}
