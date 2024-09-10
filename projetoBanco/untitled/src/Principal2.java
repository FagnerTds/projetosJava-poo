import com.github.banco.ContaInvestimento;
import com.github.banco.Titular;

public class Principal2 {
    public static void main(String[] args) {
        ContaInvestimento conta1 = new ContaInvestimento();
        conta1.setTitular(new Titular("Fagner Tranquis", "44499955520"));
        conta1.setAgencia(123);
        conta1.setNumero(999999);

        conta1.imprimeirDemosntrativo();

        conta1.depositar(100);
        conta1.imprimeirDemosntrativo();

        conta1.creditarRendimentos(6);
        conta1.imprimeirDemosntrativo();
    }
}
