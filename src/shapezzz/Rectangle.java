/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package shapezzz;

/**
 *
 * @author Lauchlan
 */
public class Rectangle {

    public Rectangle(double width, double length) {
        this.width = width;
        this.length = length;
    }

    private double width, length;

    public double getWidth() {
        return width;
    }

    public double getLength() {
        return length;
    }

    public double getArea() {
        return width * length;
    }

    public double getPerimeter() {
        return width * 2 + length * 2;
    }
}
