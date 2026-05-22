import java.util.Scanner;

public class IdentificarCaracterEspecial {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite uma palavra ou texto: ");
        String texto = scan.nextLine();

        boolean existeCaracter = texto.contains("@");

        if (existeCaracter == true) {
            System.out.println("Existe @ no texto:");
        }

        //System.out.println("Existe @ no texto:")  + existeCaracter;

        scan.close();
    }
}
