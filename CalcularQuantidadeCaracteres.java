import java.util.Scanner;

public class CalcularQuantidadeCaracteres {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite um caracter ou texto: ");
        String  texto = scan.nextLine();
        
        int QtdCarcateres = texto.length();

        System.out.println("A qtd de caracateres é " + QtdCarcateres);


        scan.close();
    }
    
}