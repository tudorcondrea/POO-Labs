package lab3.task2;

import lab3.task1.CandyBox;

public class ChocArmor extends CandyBox {
    float length;

    public ChocArmor() {

    }

    public ChocArmor(float length) {
        super("chocolate", "France");
        this.length = length;
    }

    @Override
    public float getVolume() {
        return length * length * length;
    }

    @Override
    public String toString() {
        return "The " + this.getOrigin() + " " + this.getFlavor() + " has volume " + this.getVolume();
    }

    public void printChocArmorDim() {
        System.out.println("l: " + this.length);
    }
}
