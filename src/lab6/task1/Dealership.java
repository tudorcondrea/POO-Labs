package lab6.task1;

import java.util.Random;

public class Dealership{
    private class BrandOffer implements Offer {
        public int getDiscount(Car car) {
            int discount;
            switch(car.getType())
            {
                case DACIA:
                    discount = 20;
                    break;
                case RENAULT:
                    discount = 15;
                    break;
                case SEAT:
                    discount = 10;
                    break;
                default:
                    discount = 0;
                    break;
            }
            return discount;
        }
    }

    private class DealerOffer implements Offer {
        public int getDiscount(Car car) {
            return car.getDate() * 100;
        }
    }

    private class SpecialOffer implements Offer {
        public int getDiscount(Car car) {
            Random rand = new Random();
            return rand.nextInt(300);
        }
    }

    public int getFinalPrice(Car car) {
        int finalPrice = car.getPrice();
        BrandOffer br = new BrandOffer();
        DealerOffer de = new DealerOffer();
        SpecialOffer sp = new SpecialOffer();
        finalPrice *= 1 - br.getDiscount(car) / 100;
        finalPrice -= de.getDiscount(car);
        finalPrice -= sp.getDiscount(car);
        return finalPrice;
    }

    public void negotiate(Car car, Offer offer) {
        int price = getFinalPrice(car);
        BrandOffer br = new BrandOffer();
        DealerOffer de = new DealerOffer();
        SpecialOffer sp = new SpecialOffer();
        System.out.println("Initial price: " + car.getPrice());
        System.out.println("Applying brand discount: " + car.getPrice() * br.getDiscount(car) / 100);
        System.out.println("Applying dealer discount: " + de.getDiscount(car));
        System.out.println("Applying special discount: " + sp.getDiscount(car));
        System.out.println("Final price: " + price);
        Random rand = new Random();
        if (rand.nextBoolean()) {
            System.out.println("Client discount: " + offer.getDiscount(car));
            price -= offer.getDiscount(car);
            System.out.println("Final price with client discount: " + price);
        }
    }
}
