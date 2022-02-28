package lab3.task6;

import lab3.task1.CandyBox;
import lab3.task2.Baravelli;
import lab3.task2.ChocArmor;
import lab3.task2.Lindt;
import lab3.task3.CandyBag;

import java.util.Iterator;

public class Area {
    CandyBag bag;
    int number;
    String street;

    public Area() {

    }

    public Area(CandyBag bag, int number, String street) {
        this.bag = bag;
        this.number = number;
        this.street = street;
    }

    public void getBirthdayCard() {
        System.out.println("Adresa este " + this.street + " " + this.number);
        System.out.println("la multi ani");
        Iterator iterator = this.bag.getBox().iterator();
        while (iterator.hasNext())
            System.out.println(iterator.next());
        for (CandyBox box: this.bag.getBox()) {
            if (box instanceof Baravelli)
                ((Baravelli) box).printBaravelliDim();
            else if (box instanceof ChocArmor)
                ((ChocArmor) box).printChocArmorDim();
            else if (box instanceof Lindt)
                ((Lindt) box).printLindtDim();
        }
    }

    
}
