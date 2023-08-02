package Day6;

public class Task2 {
    public static void main(String[] args) {
        Airplane Boeing = new Airplane("Fly Emirates", 2015, 105, 5000);
        Boeing.setYear(2016);
        Boeing.setLength(99);
        Boeing.fillUp(100);
        Boeing.fillUp(200);
        Boeing.info();
    }
}
