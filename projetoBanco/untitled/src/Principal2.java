import com.github.banco.Conta;
import com.github.banco.ContaInvestimento;
import com.github.banco.Titular;

public class Principal2 {
    public static void main(String[] args) {

        Titular titular = new Titular("Fagner Tranquis", "44499955520");
        ContaInvestimento conta1 = new ContaInvestimento(titular,123,9999999);

        conta1.imprimeirDemosntrativo();

        conta1.depositar(100);
        conta1.imprimeirDemosntrativo();

        conta1.creditarRendimentos(6);
        conta1.imprimeirDemosntrativo();
    }
}
