import Domain.Line;
import Domain.Point2D;

public class EjemploLines {
    public static void main(String[] args) {
        Line line = new Line(new Point2D(5,6), new Point2D(7,8));
        System.out.println(line.toString());
        line.setEndPoint1(new Point2D(11,12));
        line.setEndPoint2(new Point2D(13,14));
        System.out.println(line.toString());
        System.out.println("Length: " + line.length());
    }
}
