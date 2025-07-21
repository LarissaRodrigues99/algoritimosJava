import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //Ano de nascimento
        Scanner leia = new Scanner(System.in);
        System.out.print("Ano de nascimento: ");
        int ano = leia.nextInt();
        //Mostra idade
        int idade = 2025 - ano;
        System.out.println("Idade " + idade);
        //Mostra se é menor ou maior de idade
        String situacao = (idade >= 18) ? "MAIOR" : "MENOR";
        System.out.println("Situação: " + situacao);
        //Pode votar
        String vot = ((idade >= 16 && idade < 18) || (idade > 70)) ? "OPCIONAL" : "OBRIGATÓRIO";
        System.out.println("Seu voto é: " + vot);
    }
}