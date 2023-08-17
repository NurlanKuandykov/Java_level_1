package Day12;

import java.util.ArrayList;
import java.util.List;

public class Task1 {
    public static void main(String[] args) {
        List<String> carBrands = new ArrayList<>();
        carBrands.add("BWM");
        carBrands.add("Mercedes");
        carBrands.add("Honda");
        carBrands.add("Mazda");
        carBrands.add("Toyota");
        System.out.println(carBrands);
        carBrands.add(2, "Hyundai");
        carBrands.remove(0);
        System.out.println(carBrands);
    }
}
