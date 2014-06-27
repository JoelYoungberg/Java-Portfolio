/*
 * Joel R. Youngberg
 */
package quadrilateral;

import java.util.Date;

public class Quadrilateral_Test {

    public static void main(String[] args) {
        // TODO code application logic here
        //Displaying results of class hierarchy
        Quadrilateral myQuadrilateral = new Quadrilateral();
        Trapezoid myTrapezoid = new Trapezoid();
        Parallelogram myParallelogram = new Parallelogram();
        Rectangle myRectangle = new Rectangle();
        Square mySquare = new Square();
        
        
        System.out.println("Thank you for using the Quadrilateral application.\n" +
"	Time of calculation is: ");
        Date date = new Date();System.out.println(date.toString());
        System.out.println();
        
        System.out.println("Coordinates of Quadrilateral are: ");
        System.out.println(myQuadrilateral.getCoordString());
        System.out.println();
        
        System.out.println("Coordinates of Trapezoid are: ");
        System.out.println(myTrapezoid.getCoordString());
        System.out.printf("%s%.1f","Height of Trapezoid: ", myTrapezoid.getHeight());
        System.out.printf("\n%s%.1f","Area of Trapezoid: ", myTrapezoid.getArea());
        System.out.println();
        System.out.println();
        
        System.out.println("Coordinates of Parallelogram are: ");
        System.out.println(myParallelogram.getCoordString());
        System.out.printf("%s%.1f","Width of Parallelogram: ", myParallelogram.getWidth());
        System.out.printf("\n%s%.1f","Height of Parallelogram: ", myParallelogram.getHeight());
        System.out.printf("\n%s%.1f","Area of Parallelogram: ", myParallelogram.getArea());
        System.out.println();
        System.out.println();
        
        System.out.println("Coordinates of Rectangle are: ");
        System.out.println(myRectangle.getCoordString());
        System.out.printf("%s%.1f","Width of Rectangle: ", myRectangle.getWidth());
        System.out.printf("\n%s%.1f","Height of Rectangle: ", myRectangle.getHeight());
        System.out.printf("\n%s%.1f","Area of Rectangle: ", myRectangle.getArea());
        System.out.println();
        System.out.println();
        
        System.out.println("Coordinates of Square are: ");
        System.out.println(mySquare.getCoordString());
        System.out.printf("%s%.1f","Side of Square: ", mySquare.getWidth());
        System.out.printf("\n%s%.1f","Area of Square: ", mySquare.getArea());
        System.out.println();
        System.out.println();
    }
}
