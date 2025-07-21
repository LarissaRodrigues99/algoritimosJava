import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //Gerando um número aleatório
        int numAleatorio = (int)(Math.random() * 5);

        //Digite um valor
        Scanner num = new Scanner(System.in);
        System.out.print("Estou pensando em um número entre 1 e 5. Tente adivinhar qual é esse valor: ");
        int val = num.nextInt();

        String f1 = "ACERTOU";
        String f2 = "ERROU! Eu pensei no valor " + numAleatorio;

        String palpite = (val == numAleatorio) ? f1 : f2;
        System.out.println(palpite);


    }
}