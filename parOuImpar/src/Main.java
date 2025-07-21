import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner t = new Scanner(System.in);
        System.out.print("Informe um valor para saber se é par ou impar: ");
        int val = t.nextInt();

        if(val % 2 == 0){
            System.out.println("PAR");
        }else{
            System.out.println("IMPAR");
        }
    }
}