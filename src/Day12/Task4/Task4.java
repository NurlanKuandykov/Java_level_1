package Day12.Task4;

import java.util.ArrayList;
import java.util.List;

public class Task4 {
    public static void main(String[] args) {
        List<String> members1 = new ArrayList<>();
        members1.add("Lisa");
        members1.add("Jennie");
        members1.add("Rose");
        members1.add("Jisoo");

        MusicBand band1 = new MusicBand("Blackpink", 2016, members1);

        List<String> members2 = new ArrayList<>();
        members2.add("Jin");
        members2.add("Suga");
        members2.add("J-Hope");
        members2.add("RM");
        members2.add("Jimin");
        members2.add("V");
        members2.add("Jungkook");
        MusicBand band2 = new MusicBand("BTS", 2013, members2);

        band1.printMembers();
        band2.printMembers();

        MusicBand.transferMembers(band1, band2);

        band1.printMembers();
        band2.printMembers();

        members1.add("Agust D");
        members1.add("HyunA");

        band1.printMembers();
        band2.printMembers();
    }
}
