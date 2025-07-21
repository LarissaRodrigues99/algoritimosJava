import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //Tipos de triangulo
        Scanner slider = new Scanner(System.in);
        System.out.print("Informe um valor para o lado A: ");
        int A = slider.nextInt();
        System.out.print("Informe um valor para o lado B: ");
        int B = slider.nextInt();
        System.out.print("Informe um valor para o lado C: ");
        int C = slider.nextInt();

        if(A < B + C && B < A + C && C < A + B){
            System.out.println("Formam um triângulo");
        }else {
            System.out.println("Não formam um triângulo");
        }

        if(A == B && B == C){
            System.out.println("Equilátero");
        } else if (A != B && B != C && A != C) {
            System.out.println("Escaleno");
        }else {
            System.out.println("Isósceles");
        }
    }
}