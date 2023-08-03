package Day7;

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

    public int getLength() {
        return length;
    }

    public static void compareAirplanes(Airplane airplane1, Airplane airplane2){
        if (airplane1.getLength()>airplane2.getLength()){
            System.out.println("The first airplane longer");
        }else if (airplane1.getLength()<airplane2.getLength()){
            System.out.println("The second airplane longer");
        }else{
            System.out.println("The airplanes are the same length");
        }
    }
}
