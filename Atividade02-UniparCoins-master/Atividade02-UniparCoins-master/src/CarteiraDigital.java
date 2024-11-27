public class CarteiraDigital {
    double carteira = 0.0;
    public void adicionar(double valor){
        carteira = carteira + valor;
        System.out.println("Valor adicionado!");
    }
    public void pagamento(double valor){
        carteira = carteira - valor;
        System.out.println("Valor pago!");
    }
    public double verificarSaldo(){
        return carteira;
    }
}
