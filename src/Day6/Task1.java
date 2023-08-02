package Day6;


public class Task1 {
    public static void main(String[] args) {
        Car car = new Car();
        car.setColor("blue");
        car.setYear(2011);
        car.setModel("Solaris");

        Motorbike motorbike = new Motorbike(2015, "Honda", "Blue");

        car.info();
        motorbike.info();

        System.out.println(car.yearDifference(2023));
        System.out.println(motorbike.yearDifference(2023));
    }
}
