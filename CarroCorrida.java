public class CarroCorrida extends Carro {
    public CarroCorrida(int velocidadeInicial) {
        super(velocidadeInicial);
    }
    public void acelera() {
        velocidade = velocidade+5;
    }    
}
