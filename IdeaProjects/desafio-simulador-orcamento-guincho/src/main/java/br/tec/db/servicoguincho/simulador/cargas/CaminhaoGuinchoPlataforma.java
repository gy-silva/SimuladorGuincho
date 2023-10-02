package br.tec.db.servicoguincho.simulador.cargas;


import br.tec.db.servicoguincho.simulador.Guincho;
import br.tec.db.servicoguincho.simulador.Trajeto;

//Utilizado para veículos leves. Taxa de deslocamento: R$ 5,00 por quilômetro.
public class CaminhaoGuinchoPlataforma implements Guincho {
    private static final double TAXA_DE_DESLOCAMENTO = 5.0;

    @Override
    public double calcularCustoDeslocamento(Trajeto trajeto) {
        return TAXA_DE_DESLOCAMENTO * trajeto.getDistanciaEmKM();
    }
}
