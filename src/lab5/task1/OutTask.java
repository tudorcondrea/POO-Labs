package lab5.task1;

public class OutTask implements Task{
    private String outString;

    public OutTask(String s) {
        this.outString = s;
    }

    public void execute() {
        System.out.println(this.outString);
    }
}
