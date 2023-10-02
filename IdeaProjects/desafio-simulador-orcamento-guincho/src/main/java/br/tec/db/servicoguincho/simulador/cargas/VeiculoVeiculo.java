package br.tec.db.servicoguincho.simulador.cargas;

import br.tec.db.servicoguincho.simulador.Veiculo;

public class VeiculoVeiculo implements Veiculo {
    private TipoVeiculo tipo;
    private EstadoConservacao estado;

    public VeiculoVeiculo(TipoVeiculo tipo, EstadoConservacao estado) {
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
