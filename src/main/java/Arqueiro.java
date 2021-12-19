public class Arqueiro extends Classe{

    private int numFlechas;

    public Arqueiro(float dano) {
        super(dano);
    }

    public void setNumFlechas(int numFlechas) {
        this.numFlechas = numFlechas;
    }

    public float calcularDano() {
        return this.dano * this.numFlechas * (1 + this.item.percentualAumento());
    }
}
