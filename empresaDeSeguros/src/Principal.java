import com.github.empresaDeSeguros.model.Caminhao;
import com.github.empresaDeSeguros.model.CarroParticular;
import com.github.empresaDeSeguros.model.ImovelResidencial;
import com.github.empresaDeSeguros.model.VeiculoAutomotor;
import com.github.empresaDeSeguros.service.ServicoPropostaSeguro;

public class Principal {

    public static void main(String[] args) {
        ServicoPropostaSeguro servicoPropostaSeguro = new ServicoPropostaSeguro();

        ImovelResidencial imovel = new ImovelResidencial(2_300_000, 320);
        CarroParticular carro1 = new CarroParticular("Celta", 32_000, 1995);
        CarroParticular carro = new CarroParticular("HRV", 150_000, 2022);
        Caminhao caminhao = new Caminhao("Actros", 780_000,2021,4);


        servicoPropostaSeguro.emitir(carro);
        servicoPropostaSeguro.emitir(carro1);
        servicoPropostaSeguro.emitir(caminhao);
        servicoPropostaSeguro.emitir(imovel);
    }
}
