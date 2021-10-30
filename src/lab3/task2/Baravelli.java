package lab3.task2;

import lab3.task1.CandyBox;

import java.awt.*;

public class Baravelli extends CandyBox {
    float radius, height;

    public Baravelli() {

    }

    public Baravelli(float radius, float height) {
        super("mint", "UK");
        this.radius = radius;
        this.height = height;
    }

    @Override
    public float getVolume() {
        return radius * (float)Math.PI * height;
    }

    @Override
    public String toString() {
        return "The " + this.getOrigin() + " " + this.getFlavor() + " has volume " + this.getVolume();
    }

    public void printBaravelliDim() {
        System.out.println("r: " + this.radius + " h: " + this.height);
    }
}
