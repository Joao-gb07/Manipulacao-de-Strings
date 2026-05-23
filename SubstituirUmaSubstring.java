import java.util.Scanner;

public class SubstituirUmaSubstring {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite uma palavra");
        String texto = scan.nextLine();

        String novoTexto = texto.replace("r", "l");
        System.out.println(novoTexto);
    }
    
}