public class Main {

    public static void main(String[] args){
        Car car = new Car();
        System.out.println("make = " + car.getMake());
        System.out.println("model = " + car.getModel());
        System.out.println("color = " + car.getColor());
        System.out.println("doors = " + car.getDoors());
        System.out.println("convertible = " + car.getConvertible());
        car.describeCar();
    }
}
