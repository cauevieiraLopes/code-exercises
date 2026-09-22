import java.util.Scanner;
import java.util.function.Function;

public class Main {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int salario;

        do{
            System.out.print("Salário: R$");
            salario = sc.nextInt();
        }while (salario <= 0);

        Function<Integer, Integer> aplicarBonus = bonus -> {
            System.out.println("Aplicando bonus...");
            return bonus + 200;
        };
        Function<Integer, Integer> aplicarImposto = imposto -> {
            System.out.println("Descontando imposto...");
            return imposto - 50;
        };

        Function<Integer, Integer> pipeline = aplicarBonus.andThen(aplicarImposto);
        salario = pipeline.apply(salario);

        System.out.println("\nSalário com o bonus e desconto do imposto");
        System.out.println("R$" + salario);

        sc.close();
    }
}
