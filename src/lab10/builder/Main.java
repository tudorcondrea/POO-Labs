package lab10.builder;

public class Main {
    public static void main(String[] args) {
        System.out.println(new House.HouseBuilder("Politehnica",  3, 100).security(true).heating(false).build());
        System.out.println(new House.HouseBuilder("Timisoara 145", 5, 3).heating(true).security(true).build());
    }
}
