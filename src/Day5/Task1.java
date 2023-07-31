package Day5;

public class Task1 {
    public static void main(String[] args) {
        Car car = new Car();
        car.setColor("blue");
        car.setYear(2011);
        car.setModel("Solaris");

        System.out.println("Our car: " + car.getYear() + " year " + car.getModel() + " model " + car.getColor() + " color");
    }
}
