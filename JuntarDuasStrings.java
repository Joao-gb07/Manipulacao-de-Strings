import java.util.Scanner;

public class JuntarDuasStrings {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite um texto ou palavra ");
        String texto1 = scan.nextLine();

        
        System.out.println("Digite outro texto ou palavra ");
        String texto2 = scan.nextLine();

        String textoJunto = texto1.concat(texto2);

        System.out.println(textoJunto);

        scan.close();
    }
}
