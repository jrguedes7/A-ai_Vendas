// Classe VisualizacaoVendas no pacote view
package view;

import java.util.Map;

public class VisualizacaoVendas {
    public void exibirVendasMensais(Map<String, Double> vendasMensais) {
        System.out.println("Vendas Mensais:");
        for (Map.Entry<String, Double> entry : vendasMensais.entrySet()) {
            System.out.println(entry.getKey() + ": R$" + entry.getValue());
        }
    }

    public void exibirVendasSemanais(Map<String, Double> vendasSemanais) {
        System.out.println("Vendas Semanais:");
        for (Map.Entry<String, Double> entry : vendasSemanais.entrySet()) {
            System.out.println(entry.getKey() + ": R$" + entry.getValue());
        }
    }
}
