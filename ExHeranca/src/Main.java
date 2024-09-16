import com.github.exercicioHeranca.Funcionario;
import com.github.exercicioHeranca.Holerite;
import com.github.exercicioHeranca.Programador;

public class Main {
    public static void main(String[] args) {

        Funcionario funcionario1 = new Funcionario("Fagner", 55);

        Programador programador1 = new Programador("Fagner", 55);
        programador1.setBonus(1000);


        Holerite holerite1 = programador1.gerarHolerite(10,"setembro/2024");

        holerite1.imprimir();

    }
}