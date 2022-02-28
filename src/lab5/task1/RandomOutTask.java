package lab5.task1;
import java.util.Random;

public class RandomOutTask implements Task{
    private int value;

    public RandomOutTask() {
        Random rand = new Random();
        this.value = rand.nextInt(1000);
    }

    public void execute() {
        System.out.println(this.value);
    }
}
