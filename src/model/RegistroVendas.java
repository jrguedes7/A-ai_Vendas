// Classe RegistroVendas no pacote model
package model;

import java.util.HashMap;
import java.util.Map;

public class RegistroVendas {
    private Map<String, Double> vendasMensais;
    private Map<String, Double> vendasSemanais;

    public RegistroVendas() {
        this.vendasMensais = new HashMap<>();
        this.vendasSemanais = new HashMap<>();
    }

    public void adicionarVenda(double valor, String mes, String semana) {
        vendasMensais.put(mes, vendasMensais.getOrDefault(mes, 0.0) + valor);
        vendasSemanais.put(semana, vendasSemanais.getOrDefault(semana, 0.0) + valor);
    }

    public Map<String, Double> getVendasMensais() {
        return vendasMensais;
    }

    public Map<String, Double> getVendasSemanais() {
        return vendasSemanais;
    }
}
