import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class GuerreiroTest {

    @Test
    void deveRetornarDanoComAnel() {
        Item item = new Anel();
        Guerreiro guerreiro = new Guerreiro(1000.0f);
        guerreiro.setItem(item);
        assertEquals(1100.0f, guerreiro.calcularDano(), 0.01f);
    }

    @Test
    void deveRetornarDanoComLuva() {
        Item item = new Luva();
        Guerreiro guerreiro = new Guerreiro(1000.0f);
        guerreiro.setItem(item);
        assertEquals(1200.0f, guerreiro.calcularDano(), 0.01f);
    }

    @Test
    void deveRetornarDanoComColar() {
        Item item = new Colar();
        Guerreiro guerreiro = new Guerreiro(1000.0f);
        guerreiro.setItem(item);
        assertEquals(1300.0f, guerreiro.calcularDano(), 0.01f);
    }

}