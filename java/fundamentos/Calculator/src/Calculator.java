import java.util.Scanner;

public class Calculator {

    public static void main(String[] args) {

        double number1;
        double number2;
        int option = 0;

        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o primeiro número: ");
        number1 = sc.nextDouble();

        System.out.print("Digite o segundo número: ");
        number2 = sc.nextDouble();

        operacoes(option, number1, number2);

        sc.close();
    }

    //funções para realizar as operações

    public static void soma(double n1, double n2) {
        double resultado = n1 + n2;

        System.out.println(n1 + " + " + n2 + " = " + resultado);
    }

    public static void subtracao(double n1, double n2) {
        double resultado = n1 - n2;

        System.out.println(n1 + " - " + n2 + " = " + resultado);
    }

    public static void multiplicacao(double n1, double n2) {
        double resultado = n1 * n2;

        System.out.println(n1 + " * " + n2 + " = " + resultado);
    }

    public static void divisao(double n1, double n2) {
        double resultado = n1 / n2;

        System.out.println(n1 + " / " + n2 + " = " + resultado);
    }

    //função para decidir qual operação realizar

    public static void operacoes(int options, double n1, double n2) {

        Scanner sc1 = new Scanner(System.in);

        System.out.println("Qual operação matemática deseja realizar?");
        System.out.println("[1] ADIÇÃO.");
        System.out.println("[2] SUBTRAÇÃO.");
        System.out.println("[3] MULTIPLICAÇÃO.");
        System.out.println("[4] DIVISÃO.");
        System.out.print("Opção: ");
        options = sc1.nextInt();

        switch (options) {
            case 1:
                soma(n1, n2);
                break;
            case 2:
                subtracao(n1, n2);
                break;
            case 3:
                multiplicacao(n1, n2);
                break;
            case 4:

                if(n2 == 0) {
                    System.out.println("Não é possivel dividir um número por 0!");
                    break;
                }

                divisao(n1, n2);
                break;
            default:
                System.out.println("Opção inválida, escolha entre 1 e 5.");
                break;
        }

        sc1.close();
    }
}
