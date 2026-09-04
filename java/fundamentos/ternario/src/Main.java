import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o comando: ");
        String comando = sc.nextLine();

        String texto = (comando.equals("Comando")) ? "Válido" : "Inválido";

        System.out.printf("Comando %s", texto);
    }
}
