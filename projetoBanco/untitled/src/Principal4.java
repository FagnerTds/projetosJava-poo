import com.github.banco.*;

public class Principal4 {
    public static void main(String[] args) {

        CaixaEletronico caixaEletronico = new CaixaEletronico();

        ContaEspecial conta1 = new ContaEspecial(new Titular("Fagner Tranquis", "44499955520")
                ,123,9999999,90);
        conta1.setLimiteChequeEspecial(1000);

        ContaInvestimento conta2 = new ContaInvestimento(new Titular("Dev", "44499955520")
                ,222,888888);

        ContaSalario conta3 = new ContaSalario(new Titular("Dev", "44499955520")
                ,222,888888,2000);

        conta3.depositar(100);
        conta2.creditarRendimentos(10);

        caixaEletronico.imprimirDemonstrativo(conta3);




//




    }
}
