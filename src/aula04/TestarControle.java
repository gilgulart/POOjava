package aula04;

public class TestarControle {
    public static void main(String[] args) {
        ControleRemoto controleRemoto = new ControleRemoto();
        controleRemoto.ligar();
        controleRemoto.maisVolume();
        controleRemoto.pause();
        controleRemoto.abrirMenu();
    }
}
