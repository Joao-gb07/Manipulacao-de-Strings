import java.util.Scanner;

public class ConverterStringMaiusculas {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite uma palavra/texto ");
        String texto = scan.nextLine();
        
        System.out.println("Texto em minúsculas: " + texto.toLowerCase());
        
        scan.close();
    }
}
