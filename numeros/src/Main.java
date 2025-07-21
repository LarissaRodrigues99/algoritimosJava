import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        int n, s = 0;
        String resp;
        Scanner leia = new Scanner(System.in);

        do {
            System.out.print("Digite um número: ");
            n = leia.nextInt();
            s += n; //s = s + n;
            System.out.print("Quer continuar: [S/N] ");
            resp = leia.next();
        }while (resp.equals("S"));
        System.out.println(s);
    }
}