package geometry; 

public class Geometry {
    public static void main(String[] args) {
        MyPoint point = new MyPoint(5, 10);

        System.out.println("Point Coordinates: " + point.toString());

        double distanceToPoint = point.getDistance(3, 7);
        System.out.println("Distance to (3, 7): " + distanceToPoint);

        double distanceToOrigin = point.getDistance();
        System.out.println("Distance to Origin: " + distanceToOrigin);

        int quadrant = point.getQuadrant();
        System.out.println("Quadrant: " + quadrant);

        double angle = point.getAngle();
        System.out.println("Angle from Positive X-axis: " + angle);
    }
}
