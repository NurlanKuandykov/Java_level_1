package Day2;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        if (a>=1 && a<=4){
            System.out.println("����������� ���");
        }else if (a>=5 && a<=8){
            System.out.println("������������� ���");
            } else if (a>=9) {
            System.out.println("������������ ���");
            }else {
            System.out.println("������ �����");
        }
    }
}
