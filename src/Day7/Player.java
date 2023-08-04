package Day7;

import java.util.Random;

public class Player {
    private int stamina;
    private static final int MAX_STAMINA=100;
    private static final int MIN_STAMINA=0;
    public static int countPlayers;

    public Player(int stamina) {
        Random random = new Random();
        this.stamina = stamina;
        if (countPlayers<6) countPlayers++;
    }
    public void run(){
        if (stamina==0) return;
        stamina--;
        if (stamina==0) countPlayers--;
    }
    public static void info(){
        if (countPlayers<6){
            int free = 6-countPlayers;
            System.out.println("Teams are incomplete. There are still " + free + " empty seats on the field");
        }else{
            System.out.println("There are no empty seats on the field");
        }
    }
}
