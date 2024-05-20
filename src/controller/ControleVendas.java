// Classe ControleVendas no pacote controller
package controller;

import model.PedidoAcai;
import model.RegistroVendas;
import view.VisualizacaoVendas;

import java.time.LocalDate;
import java.time.temporal.WeekFields;
import java.util.Locale;
import java.util.Scanner;

public class ControleVendas {
    private RegistroVendas model;
    private VisualizacaoVendas view;
    private Scanner scanner;

    public ControleVendas(RegistroVendas model, VisualizacaoVendas view) {
        this.model = model;
        this.view = view;
        this.scanner = new Scanner(System.in);
    }

    public void iniciar() {
        int escolha;

        do {
            exibirMenu();
            System.out.print("Digite sua escolha: ");
            escolha = scanner.nextInt();

            switch (escolha) {
                case 1:
                    fazerVenda();
                    break;
                case 2:
                    view.exibirVendasMensais(model.getVendasMensais());
                    break;
                case 3:
                    view.exibirVendasSemanais(model.getVendasSemanais());
                    break;
                case 4:
                    System.out.println("Saindo...");
                    break;
                default:
                    System.out.println("Escolha inválida.");
            }
        } while (escolha != 4);
    }

    private void exibirMenu() {
        System.out.println("\n1. Realizar uma venda");
        System.out.println("2. Ver vendas mensais");
        System.out.println("3. Ver vendas semanais");
        System.out.println("4. Sair");
    }

    private void fazerVenda() {
        System.out.print("Qual o tamanho do açaí (1 para pequeno, 2 para grande): ");
        int tamanho = scanner.nextInt();
        System.out.print("Deseja adicionar coberturas? (true/false): ");
        boolean comCoberturas = scanner.nextBoolean();
        System.out.print("Quantos litros de açaí foram vendidos? ");
        int litros = scanner.nextInt();

        PedidoAcai pedido = new PedidoAcai(tamanho, comCoberturas);
        double valor = pedido.getPreco() * litros;

        LocalDate hoje = LocalDate.now();
        String mes = String.format("%tB", hoje); // Mês atual
        WeekFields camposSemana = WeekFields.of(Locale.getDefault());
        String semana = "Semana " + hoje.get(camposSemana.weekOfWeekBasedYear()); // Semana atual

        model.adicionarVenda(valor, mes, semana);
        System.out.println("Venda registrada com sucesso!");
    }
}
