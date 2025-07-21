import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        System.out.print("Início: ");
        int inicio = leia.nextInt();
        System.out.print("Fim: ");
        int fim = leia.nextInt();
        System.out.print("Passo: ");
        int passo = leia.nextInt();

        for(int c = inicio; c <= fim; c += passo){

            System.out.println(c);
        }
    }
}