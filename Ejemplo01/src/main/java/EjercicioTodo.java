/*
public class EjercicioTodo {
    public static void main(String[] args) {
        Line line = new Line(new Point2D(5,6), new Point2D(7,8));
        System.out.println(line.toString());
        line.setEndPoint1(new Point2D(11,12));
        line.setEndPoint2(new Point2D(13,14));
        System.out.println(line.toString());
        System.out.println("Length: " + line.length());
    }
}

public class Point3D extends Point2D {

    private int zCoord;

    public static String info = "A 3D point represented by (x,y,z)-coordinates.";
    public Point3D(int xCoord, int yCoord, int zCoord) {
        super(xCoord, yCoord);
        this.zCoord = zCoord;
    }
    //Instance Methods
    public int getzCoord() { return zCoord;}
    public void setzCoord(int zCoord) { this.zCoord = zCoord; }

    @Override
    public String toString() {
        return "(" + this.getX() + "," + this.getY() + ", " + getzCoord() + ")";
    }

    //Static Methods
    public static double distance(Point3D p1, Point3D p2){
        int xDiff = p1.getX() - p2.getX();
        int yDiff = p1.getY() - p2.getY();
        int zDiff = p1.getzCoord() - p2.getzCoord();
        return Math.sqrt(xDiff*xDiff + yDiff*yDiff + zDiff*zDiff);
    }
    public static void showInfo(){
        System.out.println(info);
    }
}
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

public class Line {
    private Point2D endPoint1;
    private Point2D endPoint2;

    //Constructor
    public Line(Point2D p1, Point2D p2){
        this.endPoint1 = p1;
        this.endPoint2 = p2;
    }

    public Point2D getEndPoint1() {
        return endPoint1;
    }

    public void setEndPoint1(Point2D endPoint1) {
        this.endPoint1 = endPoint1;
    }

    public Point2D getEndPoint2() {
        return endPoint2;
    }

    public void setEndPoint2(Point2D endPoint2) {
        this.endPoint2 = endPoint2;
    }

    public double length(){
        return Point2D.distance(endPoint1,endPoint2);
    }

    @Override
    public String toString() {
        return "Line["+endPoint1 + "," + endPoint2 + "]";
    }
}

*/