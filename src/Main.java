public class Main {
    public static void main(String[] args) {
        Car car1 = new Car("car1",4);
        Car car2 = new Car("car2",4);

        Truck truck1 = new Truck("truck1", 6);
        Truck truck2 = new Truck("truck2", 8);

        Bicycle bicycle1 = new Bicycle("bicycle1",2);
        Bicycle bicycle2 = new Bicycle("bicycle2",2);

        ServiceStation station = new ServiceStation();
        System.out.println("велосипед");
        station.check(bicycle1);
        station.check(bicycle2);
//        bicycle1.doService();
//        bicycle2.doService();
        System.out.println("авто");
        station.check(car1);
        station.check(car2);
//        car1.doService();
//        car2.doService();
        System.out.println("грузовик");
        station.check(truck1);
        station.check(truck2);
//        truck1.doService();
//        truck2.doService();

    }
}