package Domain;

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