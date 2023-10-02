package br.tec.db.servicoguincho.simulador.cargas;

import br.tec.db.servicoguincho.simulador.Guincho;
import br.tec.db.servicoguincho.simulador.SimuladorDeOrcamento;
import br.tec.db.servicoguincho.simulador.Trajeto;
import br.tec.db.servicoguincho.simulador.Veiculo;

public class SimuladorDeOrcamentoFinal implements SimuladorDeOrcamento {
    private Guincho guincho;

    public SimuladorDeOrcamentoFinal(Guincho guincho) {

        this.guincho = guincho;
    }

    @Override
    public double calcularCustoTotal(Veiculo veiculo, Trajeto trajeto) {
        double custoDeslocamento = guincho.calcularCustoDeslocamento(trajeto);


        //adicional para quebrados
        if (veiculo.getTipo() == TipoVeiculo.CAMINHAO && veiculo.getEstado() == EstadoConservacao.QUEBRADO) {
            custoDeslocamento *= 1.5;
        }

        return custoDeslocamento;
    }

}
