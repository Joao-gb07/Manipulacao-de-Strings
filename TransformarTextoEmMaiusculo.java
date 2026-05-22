import java.util.Scanner;

public class TransformarTextoEmMaiusculo {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite uma plavra/texto ");
        String texto = scan.nextLine();

        System.out.println("Texto em maisculas: " + texto.toUpperCase());
        System.out.println("Texto em minúsculas: " + texto.toLowerCase());

        scan.close();
    }
}
