import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        System.out.print("Informe quantas pernas tem: ");
        int perna = leia.nextInt();

        String tipo;

        switch (perna){
            case 1: tipo = "Saci";
            break;
            case 2: tipo = "Bípede";
            break;
            case 4: tipo = "Quadrúpede";
            break;
            case 6,8: tipo = "Aranha";
            break;
            default: tipo = "ET";
        }
        System.out.println(tipo);
    }
}