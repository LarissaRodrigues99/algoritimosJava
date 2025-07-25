
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int val[] = new int[10];
        Arrays.fill(val, 0);
        Scanner leia = new Scanner(System.in);
        int opcao;

        do {
            System.out.println("---MENU---");
            System.out.println("1º Inserir valor em uma posição");
            System.out.println("2º Exibir vetor");
            System.out.println("3º Ordena vetor");
            System.out.println("4º Excluir");
            System.out.println("0 - Sair");
            System.out.println("Escolha uma opção: ");
            opcao = leia.nextInt();

            switch(opcao){
                case 1:
                    System.out.println("Digite a posição(0 a 9): ");
                    int pos = leia.nextInt();
                    if(pos >= 0 && pos < 10){
                        System.out.print("Digite o valor: ");
                        int valor = leia.nextInt();
                        val[pos] = valor;
                    }
                    else{
                        System.out.println("Posição inválida.");
                    }
                    break;

                case 2:
                    System.out.println("Vetor atual: " + Arrays.toString(val));
                    break;

                case 3:
                    Arrays.sort(val);
                    System.out.println("Vetor ordenado" + Arrays.toString(val));
                    break;

                case 4:
                    System.out.println("Digite o valor a ser escluído: ");
                    int excluir = leia.nextInt();
                    boolean encontrado = false;
                    for(int i = 0; i < val.length; i++){
                        if(val[i] == excluir){
                            val[i] = 0;
                            encontrado = true;
                        }
                    }
                    if (encontrado){
                        System.out.println("Valor excluido com sucesso.");
                    }else {
                        System.out.println("Valor não encontrado.");
                    }
                    break;

                case 0:
                    System.out.println("Encerrando o programa.");
                    break;

                default:
                    System.out.println("Oprição inválida.");
            }

        } while (opcao != 0);
        leia.close();
    }
}