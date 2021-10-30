package lab3.task2;

import lab3.task1.CandyBox;

public class Lindt extends CandyBox {
    private float length, width, height;

    public Lindt() {

    }

    public Lindt(float length, float width, float height) {
        super("milk", "Switzerland");
        this.length = length;
        this.height = height;
        this.width = width;
    }

    @Override
    public float getVolume() {
        return length * width * height;
    }

    @Override
    public String toString() {
        return "The " + this.getOrigin() + " " + this.getFlavor() + " has volume " + this.getVolume();
    }

    public void printLindtDim() {
        System.out.println("l: " + this.length + " w: " + this.width + " h: " + this.height);
    }
}
