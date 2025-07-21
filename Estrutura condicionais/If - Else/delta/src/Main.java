import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // delta = B² - 4 * A * C
        Scanner val = new Scanner(System.in);
        System.out.print("Informe o valor de B: ");
        int B = val.nextInt();
        System.out.print("Informe o valor de A: ");
        int A = val.nextInt();
        System.out.print("Informe o valor de C: ");
        int C = val.nextInt();
        double delta = Math.pow(B, 2) -4 * A * C;
        System.out.println("🔺 = " + delta);
        if(delta < 0){
            System.out.println("Não existe raizes reais");
        }else{
            System.out.println("Existem raízer reais");
        }


    }
}