package br.tec.db.servicoguincho.simulador.cargas;

import br.tec.db.servicoguincho.simulador.Guincho;
import br.tec.db.servicoguincho.simulador.Trajeto;

//Utilizado para veículos mais pesados. Taxa de deslocamento: R$ 10,00 por quilômetro.
public class CaminhaoReboqueIntegrado implements Guincho {
    private static final double TAXA_DE_DESLOCAMENTO = 10.0;

    @Override
    public double calcularCustoDeslocamento(Trajeto trajeto) {
        return TAXA_DE_DESLOCAMENTO * trajeto.getDistanciaEmKM();
    }
}
