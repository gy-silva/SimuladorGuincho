package br.tec.db.servicoguincho.simulador.cargas;


import br.tec.db.servicoguincho.simulador.Guincho;
import br.tec.db.servicoguincho.simulador.Trajeto;

//Mais barato e utilizado para veículos quebrados. Taxa de deslocamento: R$ 2,00 por quilômetro.
public class CaminhaoCorrenteGancho implements Guincho {
    private static final double TAXA_DE_DESLOCAMENTO = 2.0;

    @Override
    public double calcularCustoDeslocamento(Trajeto trajeto) {
        return TAXA_DE_DESLOCAMENTO * trajeto.getDistanciaEmKM();
    }
}

