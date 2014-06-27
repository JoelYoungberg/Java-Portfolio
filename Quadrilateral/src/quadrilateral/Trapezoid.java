/*
 *Joel R. Youngberg
 */
package quadrilateral;

public class Trapezoid extends Quadrilateral {

    private double height;
    
    Trapezoid()
	{//Constructor initializes points for trapezoid - sets height
            
	double xVal, yVal;
        xVal = 2.0; yVal = 2.0;
        getPoint1().init(xVal, yVal);
        xVal = 4.0; yVal = 5.0;
        getPoint2().init(xVal,yVal);
        xVal = 7.0; yVal = 5.0;
        getPoint3().init(xVal,yVal);
        xVal = 9.0; yVal = 2.0;
        getPoint4().init(xVal,yVal);	
	} 
    
    public double getHeight(){
        height = getPoint2().getY() - getPoint1().getY();
    return height;
}
    
    public double getArea(){
        double base1 = getPoint3().getX() - getPoint2().getX();
        double base2 = getPoint4().getX() - getPoint1().getX();
        double area = (base1 + base2)/2 * getHeight();
        return area;
    }
    
 }//End class trapezoid  

