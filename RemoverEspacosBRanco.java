import java.util.Scanner;

public class RemoverEspacosBRanco {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite um palavra ou texto");
        String texto = scan.nextLine();

        System.out.println(texto.trim());

        scan.close();
    }
}
