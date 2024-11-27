import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String resposta = "";
        MiniChatbot bot = new MiniChatbot();
        bot.inicio();
        while(!resposta.equals("sair")){
            resposta = scan.nextLine();
            if(resposta.contains("está") && resposta.contains("você")){
                bot.comoEstou();
            } else if (resposta.contains("seu nome?")) {
                bot.meuNome();
            } else if (resposta.contains("tempo?") || resposta.contains("clima?")) {
                bot.comoEstaTempo();
            } else if (resposta.contains("Oi") || resposta.contains("Olá")) {
                bot.saudacoes();
            } else if (resposta.toLowerCase().contains("sair")) {
                bot.saida();
            }else{
                System.out.println("Desculpe, não entendi sua pergunta. Pode reformular?");
            }
        }

    }
}