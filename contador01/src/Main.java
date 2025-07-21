//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        int cc = 0;

        while(cc < 10){
            cc++;
            if (cc == 2 || cc == 3 || cc == 4){
                //Interrompe o fluxo
                continue;
            }
            if (cc == 7){
                break;
            }
            System.out.println("Cambalhota " + cc);

        }
    }
}