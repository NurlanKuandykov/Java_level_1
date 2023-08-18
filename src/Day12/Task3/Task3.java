package Day12.Task3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Task3 {
    public static void main(String[] args) {
        MusicBand band1 = new MusicBand("Linkin Park", 1996);
        MusicBand band2 = new MusicBand("Skillet", 1996);
        MusicBand band3 = new MusicBand("Blackpink", 2016);
        MusicBand band4 = new MusicBand("BTS", 2013);
        MusicBand band5 = new MusicBand("Imagine Dragons", 2008);
        MusicBand band6 = new MusicBand("Rammstein", 1994);
        MusicBand band7 = new MusicBand("Slipknot", 1995);
        MusicBand band8 = new MusicBand("Modern Talking", 1984);
        MusicBand band9 = new MusicBand("The Black Eyed Peas", 1995);
        MusicBand band10 = new MusicBand("Pendulum", 2002);

        List<MusicBand> musicBands = new ArrayList<>();
        musicBands.add(band1);
        musicBands.add(band2);
        musicBands.add(band3);
        musicBands.add(band4);
        musicBands.add(band5);
        musicBands.add(band6);
        musicBands.add(band7);
        musicBands.add(band8);
        musicBands.add(band9);
        musicBands.add(band10);

        Collections.shuffle(musicBands);
        System.out.println(musicBands);

        System.out.println(groupsAfter2000(musicBands));
    }
    public static List<MusicBand> groupsAfter2000(List<MusicBand> bands){
        List<MusicBand> musicBandsAfter2000 = new ArrayList<>();
        for (MusicBand band : bands){
            if (band.getYear()>2000) musicBandsAfter2000.add(band);
        }
        return musicBandsAfter2000;
    }
}
