import java.time.LocalDate;
import java.time.Period;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Digite seu nome: ");
        String nome = sc.nextLine();

        System.out.print("Seu ano de nascimento: ");
        int year = sc.nextInt();

        System.out.print("Seu mês de nascimento: ");
        int month = sc.nextInt();

        System.out.print("Seu dia de nascimento: ");
        int day = sc.nextInt();

        int idade  = Period.between(LocalDate.of(year, month, day), LocalDate.of(LocalDate.now().getYear(), LocalDate.now().getMonth(), LocalDate.now().getDayOfMonth())).getYears();

        System.out.println("===================================");
        System.out.println("Cadastro feito no dia: " + LocalDate.now());
        System.out.println("===================================");
        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade);
    }
}