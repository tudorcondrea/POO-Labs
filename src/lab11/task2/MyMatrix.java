package lab11.task2;

import java.util.Arrays;
import java.util.concurrent.ThreadLocalRandom;

public class MyMatrix implements Summable {
    private Double[][] matrix;

    public MyMatrix() {
        matrix = new Double[4][4];
    }

    @Override
    public void addValue(Summable value) {
        if (value instanceof MyMatrix) {
            for (int i = 0; i < 4; i++)
                for (int j = 0; j < 4; j++)
                    matrix[i][j] += ((MyMatrix) value).matrix[i][j];
        }
    }

    public void fillMat() {
        for (int i = 0; i < 4; i++)
            for (int j = 0; j < 4; j++)
                matrix[i][j] = ThreadLocalRandom.current().nextDouble();
    }

    @Override
    public String toString() {
        StringBuilder returnString = new StringBuilder("MyMatrix{" +
                "matrix=");
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++)
                returnString.append(" ").append(matrix[i][j]).append(" ");
            returnString.append("\n");
        }
        returnString.append("\n}");
        return returnString.toString();
    }
}
