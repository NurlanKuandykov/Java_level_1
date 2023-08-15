package Day11;

public class Task1 {
    public static void main(String[] args) {
        Warehouse warehouse = new Warehouse();
        Picker picker = new Picker(warehouse);
        Courier courier = new Courier(warehouse);

        System.out.println(warehouse+"; "+picker+"; "+"; "+courier);

        for (int x = 0; x<=1500; x++){
            picker.doWork();
            courier.doWork();
        }
        picker.bonus();
        courier.bonus();
        System.out.println(warehouse+"; "+picker+"; "+"; "+courier);

        Warehouse warehouse1 = new Warehouse();
        Picker picker1 = new Picker(warehouse1);
        Courier courier1 = new Courier(warehouse1);
        picker1.doWork();
        courier1.doWork();
        System.out.println(warehouse1+"; "+picker1+"; "+"; "+courier1);
        System.out.println(warehouse+"; "+picker+"; "+"; "+courier);


    }
}
