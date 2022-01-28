package lab5.task3;

public class Operation implements Plus, Minus, Div, Mult{
    private float value = 0;

    public Operation (float value) {
        this.value = value;
    }

    @Override
    public void div(float nr) {
        if (nr == 0)
            return;
        this.value /= nr;
    }

    @Override
    public void minus(float nr) {
        this.value -= nr;
    }

    @Override
    public void mult(float nr) {
        this.value *= nr;
    }

    @Override
    public void plus(float nr) {
        this.value += nr;
    }

    public float getNumber() {
        return this.value;
    }
}
