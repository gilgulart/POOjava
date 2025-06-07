package aula03;

public class Caneta {
private String modelo;
private float ponta;
private String cor;
private boolean tampada;

public Caneta(String modelo, float ponta, String cor, boolean tampada) {
    this.modelo = modelo;
    this.ponta = ponta;
    this.cor = cor;
    this.tampada = tampada;
}

public String getModelo() {
    return modelo;
}

public float getPonta() {
    return ponta;
}

public String getCor() {
    return cor;
}

public boolean isTampada() {
    return tampada;
}

public void setModelo(String modelo) {
    this.modelo = modelo;
}

public void setPonta(float ponta) {
    this.ponta = ponta;
}

public void setCor(String cor) {
    this.cor = cor;
}

public void setTampada(boolean tampada) {
    this.tampada = tampada;
}

}
