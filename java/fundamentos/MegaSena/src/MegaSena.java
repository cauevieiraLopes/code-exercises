import java.util.Random;

public class MegaSena {
    public static void main(String[]args) {

        //Tratamento de erro: 6 números inteiros
        if(args.length != 6) {
            System.out.print("Erro: Escolha 6 números inteiros entre 1 e 60!");
            return;
        }

        int[] numbers = new int[6];
        int[] ramdom_numbers = new int[6];

        //Tratamento de erro: Converter os args para números inteiros e verificar itervalo
        for(int i = 0; i < 6; i++) {
            numbers[i] = Integer.parseInt(args[i]);

            if((numbers[i] < 1) || (numbers[i] > 60)) {
                System.out.print("Erro: Os números devem ser entre 1 e 60!");
                return;
            }
        }

        //verificar duplicata
        for(int i = 0; i < 6; i++) {
            for(int j = i + 1; j < 6; j++) {

                if(numbers[i] == numbers[j]) {
                    System.out.println("Existe números duplicados, escolha números diferentes!");
                    return;
                }
            }
        }

        //Criar os números aleatórios
        Random rd = new Random();

        for(int i = 0; i < 6; i++) {
            ramdom_numbers[i] = rd.nextInt(60) + 1;
        }

        //Garantir que não tenha duplicata
        boolean isrepeat = true;

        while (isrepeat) {
            for(int i = 0; i < 6; i++) {
                for(int j = 1; j < 6; j++) {

                    if(ramdom_numbers[i] == ramdom_numbers[j]) {
                        ramdom_numbers[i] = rd.nextInt(60) + 1;
                        isrepeat = true;
                    }
                }
            }

            isrepeat = false;
        }

        //verificar acertos
        int acertos = 0;

        for(int i = 0; i < 6; i++) {
            for(int j = 0; j < 6; j++) {

                if(numbers[i] == ramdom_numbers[j]) {
                    acertos++;
                }
            }
        }

        //exibir resultado
        System.out.println("Você obteve " + acertos + " acerto(s) na Mega Sena!");
        System.out.print("Seus números: ");
        for(int i : numbers) {
            System.out.print(i + " ");
        }

        System.out.println();

        System.out.print("Números sorteados: ");
        for(int i : ramdom_numbers) {
            System.out.print(i + " ");
        }
    }
}