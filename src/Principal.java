
import controller.ControleVendas;
import model.RegistroVendas;
import view.VisualizacaoVendas;

public class Principal {
    public static void main(String[] args) {
        RegistroVendas model = new RegistroVendas();
        VisualizacaoVendas view = new VisualizacaoVendas();
        ControleVendas controller = new ControleVendas(model, view);
        controller.iniciar();
    }
}