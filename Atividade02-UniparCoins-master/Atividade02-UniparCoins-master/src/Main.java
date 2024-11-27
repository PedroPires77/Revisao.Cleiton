import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String resposta = "";
        double valor = 0;
        Scanner scan = new Scanner(System.in);
        CarteiraDigital saldo = new CarteiraDigital();
        while(!resposta.equalsIgnoreCase("sair") && !resposta.equals("4")){
            System.out.println("Escolha uma opção:\n" + "1 - Adicionar Saldo\n" + "2 - Realizar Pagamento\n" + "3 - Verificar Saldo\n" + "4 - Sair");
            resposta = scan.nextLine();
            if(resposta.toLowerCase().contains("adicionar") || resposta.contains("1")){
                System.out.println("Digite o valor para adicionar ao saldo: ");
                valor = scan.nextDouble();
                scan.nextLine();
                saldo.adicionar(valor);
            } else if (resposta.toLowerCase().contains("pagamento") || resposta.contains("2")) {
                System.out.println("Digite o valor do pagamento: ");
                valor = scan.nextInt();
                saldo.pagamento(valor);
            } else if (resposta.toLowerCase().contains("verificar") || resposta.contains("3")) {
                valor = saldo.verificarSaldo();
                System.out.println("O valor disponivel é: "+valor);
            } else if(resposta.toLowerCase().contains("sair") || resposta.contains("4")) {
                System.out.println("Obrigado por usar a sua Carteira Digital!");
            }
        }
    }
}