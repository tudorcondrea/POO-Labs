package lab6.task1;

import java.util.ArrayList;

public class Test {
    public static void main(String[] args) {
        Car car1 = new Car(10000, 2, Car.CarType.DACIA);
        Car car2 = new Car(21000, 1, Car.CarType.RENAULT);
        Car car3 = new Car(12000, 3, Car.CarType.SEAT);
        Dealership dealer = new Dealership();
        System.out.println(dealer.getFinalPrice(car1));
        System.out.println(dealer.getFinalPrice(car2));
        System.out.println(dealer.getFinalPrice(car3));
        Offer clientOffer = new Offer() {
            @Override
            public int getDiscount(Car car) {
                return 300;
            }
        };
        dealer.negotiate(car1, clientOffer);

        ArrayList<Car> carList = new ArrayList<Car>(3);
        carList.add(car1);
        carList.add(car2);
        carList.add(car3);
        carList.removeIf((car) -> car.getPrice() > 11000);
        System.out.println(carList);
    }
}
