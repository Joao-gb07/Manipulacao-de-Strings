import java.util.Scanner;

public class InverterUmaString {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite uma palavra ou texto ");
        String texto = scan.nextLine();

        for (int i = texto.length() - 1 ; i >= 0; i--) {
            char letra = texto.charAt(i);
            System.out.print(letra);
        }
        
        scan.close();
    }
}
