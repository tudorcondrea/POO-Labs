package lab11.task2;

import java.util.*;

public class Main {

    public static void main(final String[] args) {
        MyVector3 vector1 = new MyVector3(1.0, 1.0, 1.0);
        MyVector3 vector2 = new MyVector3(1.0, 0.0, 0.0);
        MyVector3 vector3 = new MyVector3(2.0, -1.0, -1.0);
        System.out.println(addAll(new ArrayList<>(Arrays.asList(vector1, vector2, vector3))));
        MyMatrix mat1 = new MyMatrix();
        mat1.fillMat();
        MyMatrix mat2 = new MyMatrix();
        mat2.fillMat();
        System.out.println(addAll(new ArrayList<>(Arrays.asList(mat1, mat2))));
    }

    public static <T extends Summable> Summable addAll(List<T> elements) {
        T firstElement = elements.get(0);
        elements.remove(0);
        for (T element : elements) {
            firstElement.addValue(element);
        }
        return firstElement;
    }


}
