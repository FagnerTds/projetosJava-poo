import com.github.banco.Conta;
import com.github.banco.ContaEspecial;
import com.github.banco.ContaInvestimento;
import com.github.banco.Titular;

public class Principal4 {
    public static void main(String[] args) {

        Titular titular = new Titular("Fagner Tranquis", "44499955520");
        Conta conta1 = new Conta(titular,123,9999999);
        Conta conta2 = new Conta(titular,123,9999999);

        ContaInvestimento conta3 = new ContaInvestimento(titular,123,9999999);
//
//        ContaEspecial conta3 = new ContaEspecial(titular,123,9999999,90);



        System.out.println(conta1.equals(conta3));
    }
}
