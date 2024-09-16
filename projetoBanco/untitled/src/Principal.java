import com.github.banco.Conta;
import com.github.banco.Titular;

public class Principal {
    public static void main(String[] args) {

        Titular titular = new Titular("Fagner Tranquis", "44499955520");
        Conta conta1 = new Conta(titular,123,9999999);

        conta1.imprimeirDemosntrativo();

        conta1.depositar(100);
        conta1.imprimeirDemosntrativo();

        conta1.sacar(25);
        conta1.imprimeirDemosntrativo();


    }
}
