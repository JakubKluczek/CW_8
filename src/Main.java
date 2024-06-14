public class Main {
    public static void main(String[] args) {
        Car car = new Car("mercedes", "abcd", 2020, 20000, 500);
        Truck truck = new Truck("mercedes", "qqww", 2015, 30000, 700, 20);

        System.out.println( car.calculateFuelEfficiency());
        System.out.println( truck.calculateFuelEfficiency());
    }
}