package br.tec.db.servicoguincho.simulador.cargas;

import br.tec.db.servicoguincho.simulador.Veiculo;

public class VeiculoDeTransporte implements Veiculo {
    private TipoVeiculo tipo;
    private EstadoConservacao estado;

    public VeiculoDeTransporte(TipoVeiculo tipo, EstadoConservacao estado) {
        this.tipo = tipo;
        this.estado = estado;
    }

    @Override
    public TipoVeiculo getTipo() {
        return tipo;
    }

    @Override
    public EstadoConservacao getEstado() {
        return estado;
    }

}
