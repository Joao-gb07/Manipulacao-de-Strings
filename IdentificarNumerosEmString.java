import java.util.Scanner;

public class IdentificarNumerosEmString {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite uma palavra ou texto");
        String texto = scan.nextLine();

        //Expressão regular identificar se possui pelo menoos um numero (0 a 9)
        boolean contemNumero = texto.matches(".*\\d.*");

        System.out.println("O texto contem numeros: " + contemNumero);

        scan.close();
    }
}

//Utilizar Expressões regulares para fazer essa validação