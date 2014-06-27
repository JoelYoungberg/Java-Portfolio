/*
 * Joel R. Youngberg
 */
package quadrilateral;

public class Quadrilateral {
    //Declaring x & y values for the four points of the quadrilateral
    
    private Point Point1 = new Point(); //Possible solution here: Point Point1 = new Point(1.0,3.0); on down line
    private Point Point2 = new Point();
    private Point Point3 = new Point();
    private Point Point4 = new Point();
    
    //Setting points to four quadrilateral points with constructor
    Quadrilateral(){
        double xVal, yVal;
        xVal = 1.0; yVal = 3.0;
        this.Point1.init(xVal,yVal);
        xVal = 8.0; yVal = 2.0;
        this.Point2.init(xVal,yVal);
        xVal = 7.0; yVal = 6.0;
        this.Point3.init(xVal,yVal);
        xVal = 4.0; yVal = 1.0;
        this.Point4.init(xVal,yVal);
    }
    public Point getPoint1(){
        return Point1;
    }
    public Point getPoint2(){
        return Point2;
    }
    public Point getPoint3(){
        return Point3;
    }
    public Point getPoint4(){
        return Point4;
    }
    public String getCoordString(){//Getting coordinates + concatenating
        String coord;
         coord = "(" + getPoint1().getX() + ", " + getPoint1().getY() + ")"
               + "(" + getPoint2().getX() + ", " + getPoint2().getY() + ")"
               + "(" + getPoint3().getX() + ", " + getPoint3().getY() + ")"
               + "(" + getPoint4().getX() + ", " + getPoint4().getY() + ")";
                 return coord;
    }//End getCoordString
  }//End class Quadrilateral
 

