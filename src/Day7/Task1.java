package Day7;

public class Task1 {
    public static void main(String[] args) {
        Airplane airplane1 = new Airplane("Fly Emirates", 2015, 103, 5000);
        Airplane airplane2 = new Airplane("Fly Emirates", 2015, 105, 5000);
        Airplane.compareAirplanes(airplane1, airplane2);
    }
}
