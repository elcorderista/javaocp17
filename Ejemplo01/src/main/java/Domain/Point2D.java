//File: Point2D.java
package Domain;


public class Point2D {
    //Class Member Declarations

    //Fields:
    private int x;
    private int y;

    private static String info = "A point represented by (x,y) - coordinates.";

    //Constructor
    public Point2D(int xCoord, int yCoord){
        this.x = xCoord;
        this.y = yCoord;
    }

    //Methods
    public int getX() { return x; }

    public void setX(int x) { this.x = x;  }
    public int getY() { return y; }
    public void setY(int y) { this.y = y; }
    @Override
    public String toString() {
        return "(" + x + "," + y + ")";
    }

    //Static Methods:
    public static double distance(Point2D p1, Point2D p2){
        int xDiff = p1.x - p2.x;
        int yDiff = p1.y - p2.y;
        return Math.sqrt(xDiff*xDiff + yDiff*yDiff);
    }
    public static void showInfo() {
        System.out.println(info);
    };
}
