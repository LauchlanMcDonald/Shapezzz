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
public class Triangle {

    public Triangle(double base, double height) {
        this.base = base;
        this.height = height;

    }

    private double base, height;

    public double setBase() {
        return base;
    }

    public double setHeight() {
        return height;
    }

    public double getArea() {
        return height * base / 2.0;
    }

}
