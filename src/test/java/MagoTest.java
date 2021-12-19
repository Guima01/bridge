import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MagoTest {

    @Test
    void deveRetornarDanoComAnel() {
        Item item = new Anel();
        Mago mago = new Mago(1000.0f);
        mago.setItem(item);
        assertEquals(1000.0f, mago.calcularDano(), 0.01f);
    }

    @Test
    void deveRetornarDanoComLuva() {
        Item item = new Luva();
        Mago mago = new Mago(1000.0f);
        mago.setItem(item);
        assertEquals(1000.0f, mago.calcularDano(), 0.01f);
    }

    @Test
    void deveRetornarDanoComColar() {
        Item item = new Colar();
        Mago mago = new Mago(1000.0f);
        mago.setItem(item);
        assertEquals(1000.0f, mago.calcularDano(), 0.01f);
    }

}