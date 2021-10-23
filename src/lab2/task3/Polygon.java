package lab2.task3;

public class Polygon {
    private Point[] coordinates;

    public Polygon(int n) {
        this.coordinates = new Point[n];
    }

    public Polygon(Point[] coordinates) {
        this(coordinates.length);
        this.coordinates = coordinates;
    }

    public static void main(String[] args) {
        Point[] dataSet = new Point[4];
        dataSet[0] = new Point(0, 0);
        dataSet[1] = new Point(1, 3);
        dataSet[2] = new Point(4, 6);
        dataSet[3] = new Point(2, 1);
        Polygon poly = new Polygon(dataSet);
        for (Point p: poly.coordinates) {
            System.out.println(p.toString());
        }
    }
}
