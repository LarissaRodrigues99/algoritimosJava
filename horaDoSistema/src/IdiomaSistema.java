import java.util.Locale;

public class IdiomaSistema {
    public static void main(String[] args) {
    //Criar um sistema que identifique o idioma do sistema operacional
        Locale idiomaSistema = Locale.getDefault();

        System.out.println("Seu sistema está em: " + idiomaSistema);
    }
}
