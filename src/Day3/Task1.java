package Day3;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true){
            String city = sc.nextLine();
            if (city.equalsIgnoreCase("Stop"))
                break;

            switch (city) {
                case "������", "�����������", "������" -> System.out.println("������");
                case "���", "�����", "�����" -> System.out.println("������");
                case "���������", "���������", "������" -> System.out.println("������");
                case "������", "������", "ʸ���" -> System.out.println("��������");
                default -> System.out.println("����������� ������");
            }
        }
    }
}
