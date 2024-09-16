import com.github.banco.Conta;
import com.github.banco.ContaEspecial;
import com.github.banco.Titular;

public class Principal3 {

    public static void main(String[] args) {
        Titular titular = new Titular("Fagner Tranquis", "44499955520");
        ContaEspecial conta1 = new ContaEspecial(titular,123,9999999,90);

        conta1.setLimiteChequeEspecial(1000);


        conta1.imprimeirDemosntrativo();

        conta1.depositar(100);
        conta1.imprimeirDemosntrativo();

        conta1.sacar(200);
        conta1.imprimeirDemosntrativo();

        conta1.debitarTarifaMensal();
        conta1.imprimeirDemosntrativo();
    }
}
