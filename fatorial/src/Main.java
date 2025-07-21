import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner val = new Scanner(System.in);
        System.out.print("Informe um número: ");
        int n = val.nextInt();

        int fat = 1;
        int c = n;

        while (c >= 1){
            fat *= c;
            c--;
        }
        System.out.println(n + "! = " + fat);
    }
}