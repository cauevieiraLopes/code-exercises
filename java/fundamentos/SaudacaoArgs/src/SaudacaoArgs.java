public class SaudacaoArgs {

    public static void main(String[] args) {

        if(args.length != 3) {
            System.out.println("Erro: Por favor, informe seu Nome, Idade e Cidade.");
            return;
        }

        String name = args[0];
        String city = args[2];
        int age = Integer.parseInt(args[1]);

        System.out.println("Hello " + name + ", you are " + age + " years old" + " and lives in " + city);
    }
}