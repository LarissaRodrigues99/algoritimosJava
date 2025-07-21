import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner tec = new Scanner(System.in);
        System.out.print("Em que ano você nasceu? ");
        int nasc = tec.nextInt();
        int i = 2025 - nasc;
        System.out.println("Sua idade é " + i);
        if(i >= 18){
            System.out.println("Maior de idade");
        }else {
            System.out.println("Menor de idade");
        }
    }
}