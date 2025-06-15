package projetoHeranca;

public class Colleger extends Student{
    private float schoolarship;

    public void renewSchoolarship(){
        System.out.println("Renovando bolsa de " + this.getName());
    }

    @Override
    public void payMensality() {
    System.out.println(this.getName() + " é bolsista! Pagamento efetuado");
    }

    public float getSchoolarship() {
        return schoolarship;
    }

    public void setSchoolarship(float schoolarship) {
        this.schoolarship = schoolarship;
    }
}
