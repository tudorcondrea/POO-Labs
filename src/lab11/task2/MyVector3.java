package lab11.task2;

public class MyVector3 implements Summable{
    private Double x, y, z;

    public MyVector3(Double x, Double y, Double z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    @Override
    public void addValue(Summable value) {
        if (value instanceof MyVector3) {
            x += ((MyVector3) value).x;
            y += ((MyVector3) value).y;
            z += ((MyVector3) value).z;
        }
    }

    @Override
    public String toString() {
        return "MyVector3{" +
                "x=" + x +
                ", y=" + y +
                ", z=" + z +
                '}';
    }
}
