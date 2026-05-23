import java.util.Scanner;

public class ContarVezesCaracter {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);


        System.out.println("Digite uma palavra ");
        String texto = scan.nextLine();

        for (int i = texto.length()  ; i >= 0; i++) {
            char letra = texto.charAt(i);
            System.out.print(letra);
        }
        
        scan.close();
    }
}
 