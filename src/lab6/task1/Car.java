package lab6.task1;

public class Car {
    private int price, date;

    static enum CarType {
        DACIA,
        RENAULT,
        SEAT
    }

    CarType type;

    public Car(int price, int date, CarType type) {
        this.price = price;
        this.date = date;
        this.type = type;
    }

    public CarType getType() {
        return type;
    }

    public int getDate() {
        return date;
    }

    public int getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return "Car{" +
                "price=" + price +
                ", date=" + date +
                ", type=" + type +
                '}';
    }
}
