package br.tec.db.servicoguincho.simulador.cargas;

import br.tec.db.servicoguincho.simulador.Trajeto;


//usado para fazer o cálculo entre o trajeto de bairros, implementando a interface trajeto
public class TrajetoEntreBairros implements Trajeto {
    private int distanciaEmKM;

    public TrajetoEntreBairros(int distanciaEmKM) {

        this.distanciaEmKM = distanciaEmKM;
    }

    @Override
    public Integer getDistanciaEmKM() {

        return distanciaEmKM;
}

}
