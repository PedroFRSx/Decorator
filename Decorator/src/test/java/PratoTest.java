import org.example.*;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PratoTest {

    @Test
    public void deveRetornarPrecoPratoSimples() {
        Prato prato = new PratoSimples(20.0f, "Prato Simples");
        assertEquals(20.0f, prato.getPreco());
    }

    @Test
    public void deveRetornarPrecoPratoComBebida() {
        Prato prato = new Bebida(new PratoSimples(20.0f, "Prato Simples"), 5.0f);
        assertEquals(25.0f, prato.getPreco());
    }

    @Test
    public void deveRetornarPrecoPratoComSobremesa() {
        Prato prato = new Sobremesa(new PratoSimples(20.0f, "Prato Simples"), 7.0f);
        assertEquals(27.0f, prato.getPreco());
    }

    @Test
    public void deveRetornarPrecoPratoComAdicional() {
        Prato prato = new Adicional(new PratoSimples(20.0f, "Prato Simples"), 3.0f);
        assertEquals(23.0f, prato.getPreco());
    }

    @Test
    public void deveRetornarDescricaoPratoComBebida() {
        Prato prato = new Bebida(new PratoSimples(20.0f, "Prato Simples"), 5.0f);
        assertEquals("Prato Simples, Bebida", prato.getDescricao());
    }

    @Test
    public void deveRetornarDescricaoPratoComSobremesa() {
        Prato prato = new Sobremesa(new PratoSimples(20.0f, "Prato Simples"), 7.0f);
        assertEquals("Prato Simples, Sobremesa", prato.getDescricao());
    }

    @Test
    public void deveRetornarDescricaoPratoComAdicional() {
        Prato prato = new Adicional(new PratoSimples(20.0f, "Prato Simples"), 3.0f);
        assertEquals("Prato Simples, Adicional", prato.getDescricao());
    }

    @Test
    public void deveRetornarPrecoPratoComTodosComplementos() {
        Prato prato = new Adicional(new Sobremesa(new Bebida(new PratoSimples(20.0f, "Prato Simples"), 5.0f), 7.0f), 3.0f);
        assertEquals(35.0f, prato.getPreco());
    }

    @Test
    public void deveRetornarDescricaoPratoComTodosComplementos() {
        Prato prato = new Adicional(new Sobremesa(new Bebida(new PratoSimples(20.0f, "Prato Simples"), 5.0f), 7.0f), 3.0f);
        assertEquals("Prato Simples, Bebida, Sobremesa, Adicional", prato.getDescricao());
    }
}