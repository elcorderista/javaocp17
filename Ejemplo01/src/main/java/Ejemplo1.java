import Domain.Point2D;
import Domain.Point3D;

//File:Point2D.jaca
public class Ejemplo1 {
    public static void main(String[] args) {
        Point2D point = new Point2D(3,5);
        Point2D point2 = new Point2D(6,7);
        System.out.println("point = " + point);

        double distancie = Point2D.distance(point, point2);
        System.out.println("Distance :" + distancie);
        Point2D.showInfo();

        //****************HERENCIA
        System.out.println("*******HERENCIA**************");
        Point3D p3A = new Point3D(10,20,30);
        System.out.println(p3A.toString());
        System.out.println("x " + p3A.getX());
        System.out.println("y " + p3A.getY());
        System.out.println("z " + p3A.getzCoord());

        p3A.setzCoord(-10); p3A.setX(-20); p3A.setzCoord(-30);
        System.out.println(p3A.toString());

        Point3D p3B = new Point3D(30,20,10);
        System.out.println(p3B.toString());
        System.out.println(Point3D.distance(p3A, p3B));
        Point3D.showInfo();
    }
}
