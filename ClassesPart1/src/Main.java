public class Main {

    public static void main(String[] args){

        Car car = new Car();
        car.setMake("Porsche");
        car.setModel("Carrera");
        car.setColor("Red");
        car.setDoors(2);
        car.setConvertible(true);

        System.out.println("make = " + car.getMake());
        System.out.println("model = " + car.getModel());
        System.out.println("color = " + car.getColor());
        System.out.println("doors = " + car.getDoors());
        System.out.println("convertible = " + car.isConvertible());
        car.describeCar();
        System.out.println();

        Car targa = new Car();

        targa.setMake("Porsche");
        targa.setModel("Targa");
        targa.setColor("Red");
        targa.setDoors(2);
        targa.setConvertible(false);

        System.out.println("make = " + targa.getMake());
        System.out.println("model = " + targa.getModel());
        System.out.println("color = " + targa.getColor());
        System.out.println("doors = " + targa.getDoors());
        System.out.println("convertible = " + targa.isConvertible());
        targa.describeCar();


    }
}
