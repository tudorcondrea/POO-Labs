package lab5.task1;

public class CounterOutTask implements Task{
    public static int count = 0;

    public void execute () {
        count++;
        System.out.println(count);
    }
}
