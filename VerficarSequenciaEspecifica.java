import java.util.Scanner;

public class VerficarSequenciaEspecifica {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite um textos ");
        String texto = scan.nextLine();

        String buscas = "estudar";

        if (texto.contains(buscas)) {
            System.out.println("A palavra que se repete é " + buscas);
        }

        scan.close();
    }
}
