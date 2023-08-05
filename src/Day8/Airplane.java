package Day8;

public class Airplane {
    private String producer;
    private int year;
    private int length;
    private int weight;
    private int fuel;

    public Airplane(String producer, int year, int length, int weight) {
        this.producer = producer;
        this.year = year;
        this.length = length;
        this.weight = weight;
        this.fuel = 0;
    }
    public void info(){
        System.out.println("Manufacturer: " + producer + ", year of manufacture: " + year + ", length: " + length + ", weight: " + weight + ", fuel: " + fuel);
    }
    public void fillUp(int inputFuel){
        fuel += inputFuel;
    }
    public void setYear(int year1) {
        this.year = year1;
    }
    public void setLength(int length1) {
        this.length = length1;
    }

    @Override
    public String toString() {
        return "Manufacturer: " + producer + ", year of manufacture: " + year + ", length: " + length + ", weight: " + weight + ", fuel: " + fuel;
    }
}
