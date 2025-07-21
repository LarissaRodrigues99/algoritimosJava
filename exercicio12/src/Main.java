
import javax.swing.JOptionPane;

public class Main {
    public static void main(String[] args) {

        int v, s = 0;
        int pares = 0, impar = 0, acima = 0, total = 0;
        float m = 0;

        do {
            v = Integer.parseInt(JOptionPane.showInputDialog(null,
                     "<html>Informe um valor: <br><em>(valor 0 interrompe)</em></html>"));
            if(v != 0) {
                s += v;
                total++;

                if (v % 2 == 0) {
                    pares++;
                } else {
                    impar++;
                }

                if (v > 100) {
                    acima++;
                }
            }

        }while (v != 0);
        if (total > 0) {
            m = s / total;
        }
        JOptionPane.showMessageDialog(null,"<html>Resultado: <br> <hr><br>" +
                "Total de valores: " + s +
                "<br>Total de pares: " + pares +
                "<br>Total de ímpares: " + impar +
                "<<br>Acima de 100: " + acima +
                "<br>Média dos valores: " + m + "</html>");
    }
}