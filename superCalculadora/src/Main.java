import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //Informar um valor
        Scanner tecla = new Scanner(System.in);

        System.out.print("Informe um valor: ");
        int val = tecla.nextInt();
        //Resto da divisão por 2
        int resto = val % 2;
        System.out.println("Resto da divisão por 2: " + resto);
        //Elevado ao cubo
        float ec = (float) Math.pow(val, 3);
        System.out.println(val + "³ é igual a: " + ec);
        //Raiz quadrada
        int rq = (int) Math.sqrt(val);
        System.out.println("A rais quadrada de " + val + " é: " + rq);
        //Raiz cúbica
        int rc = (int) Math.cbrt(val);
        System.out.println("A raiz cúbica de " + val + " é: " + rc);
        //Valor absoluto
        int vab = Math.abs(val);
        System.out.println("O valor absoluto de " + val + " é: " + vab);
    }
}