// Classe PedidoAcai no pacote model
package model;

public class PedidoAcai {
    private int tamanho;
    private boolean comCoberturas;
    private double preco;

    public PedidoAcai(int tamanho, boolean comCoberturas) {
        this.tamanho = tamanho;
        this.comCoberturas = comCoberturas;
        calcularPreco();
    }

    private void calcularPreco() {
        double precoBase = 5.0; // Preço base do açaí
        double precoCoberturas = comCoberturas ? 2.0 : 0.0; // Preço adicional se com coberturas
        double fatorTamanho = tamanho == 1 ? 1.0 : 1.5; // Fator de preço para tamanho do açaí

        preco = precoBase * fatorTamanho + precoCoberturas;
    }

    public double getPreco() {
        return preco;
    }
}
