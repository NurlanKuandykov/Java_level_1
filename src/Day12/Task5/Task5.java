package Day12.Task5;

import java.util.ArrayList;
import java.util.List;

public class Task5 {
    public static void main(String[] args) {
        List<MusicArtist> members1 = new ArrayList<>();
        members1.add(new MusicArtist("Lisa", 26));
        members1.add(new MusicArtist("Jennie", 26));
        members1.add(new MusicArtist("Rose",26));
        members1.add(new MusicArtist("Jisoo", 28));

        MusicBand band1 = new MusicBand("Blackpink", 2016, members1);

        List<MusicArtist> members2 = new ArrayList<>();
        members2.add(new MusicArtist("Jin",30));
        members2.add(new MusicArtist("Suga", 30));
        members2.add(new MusicArtist("J-Hope", 29));
        members2.add(new MusicArtist("RM", 28));
        members2.add(new MusicArtist("Jimin", 27));
        members2.add(new MusicArtist("V", 27));
        members2.add(new MusicArtist("Jungkook", 25));
        MusicBand band2 = new MusicBand("BTS", 2013, members2);

        band1.printMembers();
        band2.printMembers();

        MusicBand.transferMembers(band1, band2);

        band1.printMembers();
        band2.printMembers();

    }
}
