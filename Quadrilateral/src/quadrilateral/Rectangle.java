/*
 * Joel R. Youngberg
 */
package quadrilateral;

public class Rectangle extends Parallelogram{
    
Rectangle()
{//Constructor to initialize points again...
double xVal, yVal;
        xVal = 2.0; yVal = 2.0;
        getPoint1().init(xVal, yVal);
        xVal = 2.0; yVal = 6.0;
        getPoint2().init(xVal,yVal);
        xVal = 8.0; yVal = 6.0;
        getPoint3().init(xVal,yVal);
        xVal = 8.0; yVal = 2.0;
        getPoint4().init(xVal,yVal);
}

}