import java.util.Scanner;

public class ExtrairParteFinalSubString {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite um palavra ou texto");
        String texto = scan.nextLine();

        String email = texto.substring(texto.indexOf("@"));
        
        String primeiraParteEmail = texto.substring(0, texto.indexOf("@"));

        
        
       
       

        scan.close();
    }
}
