import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        System.out.print("Informe o ano de nascimento: ");
        int i = leia.nextInt();

        int idade = 2025 - i;
        System.out.println("Sua idade é: " + idade);

        if(idade < 16){
            System.out.println("Não vota");
        } else if ((idade >= 16 && idade < 18) || (idade > 70)){

            System.out.println("Opcioonal");
        }else{
            System.out.println("Obrigatório");
        }
    }
}