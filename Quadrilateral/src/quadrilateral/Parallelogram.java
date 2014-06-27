/*
 * Joel R. Youngberg
 */
package quadrilateral;

public class Parallelogram extends Trapezoid{
    private double width;
    

Parallelogram()
{//Constructor initializes points for trapezoid - sets height
            
	double xVal, yVal;
        xVal = 2.0; yVal = 2.0;
        getPoint1().init(xVal, yVal);
        xVal = 4.0; yVal = 6.0;
        getPoint2().init(xVal,yVal);
        xVal = 10.0; yVal = 6.0;
        getPoint3().init(xVal,yVal);
        xVal = 8.0; yVal = 2.0;
        getPoint4().init(xVal,yVal);

}//End constructor

public double getWidth(){
    width = getPoint3().getX() - getPoint2().getX();
    return width;
}

}//End class Parallelogram