import java.text.SimpleDateFormat;
import java.util.Date;

public class ContaCorrente extends Conta {
    @Override
    public void imprimeExtrato() {
        System.out.println("Extrato da Conta Corrente");
        SimpleDateFormat data = new SimpleDateFormat("dd/MM/aaaa HH:mm:ss");
        Date date = new Date();
        System.out.println("Saldo: "+this.getSaldo());
        System.out.println("Data: "+data.format(date));
    }
}

