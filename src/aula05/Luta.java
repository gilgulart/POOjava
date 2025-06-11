package aula05;

import java.util.Random;

public class Luta {
    private Lutador desafiado;
    private Lutador desafiante;
    private int rounds;
    private boolean aprovada;

    public void marcarLuta(Lutador lutador1, Lutador lutador2){
        if (lutador1.getCategoria().equals(lutador2.getCategoria()) && lutador1 != lutador2){
        this.setAprovada(true);
        this.setDesafiado(lutador1);
        this.setDesafiante(lutador2);
        } else {
            this.setAprovada(false);
            this.setDesafiado(null);
            this.setDesafiante(null);
        }
    }

    public void lutar(){
        if (this.isAprovada()){
            System.out.println("### DESAFIADO ###");
            this.desafiado.apresentar();
            System.out.println("### DESAFIANTE ###");
            this.desafiante.apresentar();
            Random aleatorio = new Random();
            int vencedor = aleatorio.nextInt(3);
            switch (vencedor){
            case 0:
                System.out.println("Empatou!");
                this.desafiado.empatarLuta();
                this.desafiante.empatarLuta();
                break;
            case 1:
                System.out.println(desafiado.getNome() + " venceu a luta!");
                this.desafiado.ganharLuta();
                this.desafiante.perderLuta();
                break;
            case 2:
                System.out.println(desafiante.getNome() + " venceu a luta!");
                this.desafiante.ganharLuta();
                this.desafiado.perderLuta();
                break;
        }
        } else {
            System.out.println("Luta não pode acontecer");
        }
    }

    public Luta() {
        this.aprovada = false;
        this.rounds = 0;
    }

    public Lutador getDesafiado() {
        return desafiado;
    }

    public void setDesafiado(Lutador desafiado) {
        this.desafiado = desafiado;
    }

    public Lutador getDesafiante() {
        return desafiante;
    }

    public void setDesafiante(Lutador desafiante) {
        this.desafiante = desafiante;
    }

    public int getRounds() {
        return rounds;
    }

    public void setRounds(int rounds) {
        this.rounds = rounds;
    }

    public boolean isAprovada() {
        return aprovada;
    }

    public void setAprovada(boolean aprovada) {
        this.aprovada = aprovada;
    }
}
