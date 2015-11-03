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
public class Shapezzz {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        testShapes();
    }

    private static void testShapes() {
//        Circle myCircle = new Circle(11.5);
//        myCircle.setRadius(11.5);

//        System.out.println("Circle");
//        System.out.printf("  radius        = %2f\n", myCircle.getRadius());
//        System.out.printf("  area          = %2f\n", myCircle.getArea());
//        System.out.printf("  circumference = %2f\n", myCircle.getCircumference());
//        System.out.printf("  diameter      = %2f\n", myCircle.getDiameter());
//        Rectangle myRectangle = new Rectangle(8.6, 10.3);
//
//        System.out.println("Rectangle");
//        System.out.printf(" width         = %2f\n", myRectangle.getWidth());
//        System.out.printf(" length        = %2f\n", myRectangle.getLength());
//        System.out.printf(" perimeter     = %2f\n", myRectangle.getPerimeter());
//        System.out.printf(" area          = %2f\n", myRectangle.getArea());

        Triangle myTriangle = new Triangle(6.7, 9.4);

        System.out.println("Triangle");
        System.out.printf("base          = %2f\n", myTriangle.setBase());
        System.out.printf("height        = %2f\n", myTriangle.setHeight());
        System.out.printf("area          = %2f\n", myTriangle.getArea());

    }

}
