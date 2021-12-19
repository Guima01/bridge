import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ArqueiroTest {

    @Test
    void deveRetornarDanoComAnel() {
        Item item = new Anel();
        Arqueiro arqueiro = new Arqueiro(1000.0f);
        arqueiro.setItem(item);
        arqueiro.setNumFlechas(2);
        assertEquals(2200.0f, arqueiro.calcularDano(), 0.01f);
    }

    @Test
    void deveRetornarDanoComLuva() {
        Item item = new Luva();
        Arqueiro arqueiro = new Arqueiro(1000.0f);
        arqueiro.setItem(item);
        arqueiro.setNumFlechas(2);
        assertEquals(2400.0f, arqueiro.calcularDano(), 0.01f);
    }

    @Test
    void deveRetornarDanoComColar() {
        Item item = new Colar();
        Arqueiro arqueiro = new Arqueiro(1000.0f);
        arqueiro.setItem(item);
        arqueiro.setNumFlechas(2);
        assertEquals(2600.0f, arqueiro.calcularDano(), 0.01f);
    }
}