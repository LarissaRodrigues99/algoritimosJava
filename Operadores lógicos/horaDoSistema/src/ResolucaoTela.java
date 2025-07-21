import java.awt.*;

public class ResolucaoTela {
    public static void main(String[] args) {
        //Criar um sistema que identifique a resolução de tela
        Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();

        int largura = screenSize.width;
        int altura = screenSize.height;

        System.out.println("Resolução da tela: " + largura + " X " + altura);
    }
}
