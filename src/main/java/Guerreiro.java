public class Guerreiro extends Classe{

    public Guerreiro(float dano) {
        super(dano);
    }
    public float calcularDano() {
        return this.dano * (1 + this.item.percentualAumento());
    }
}
