public class Carro {
    public int velocidade;
    public Carro(int velocidadeInicial) {
        velocidade = velocidadeInicial;
    }
    public void acelera() {
        velocidade = velocidade+1;
    }
    public void freia() {
        velocidade = velocidade-1;
    }    
}
