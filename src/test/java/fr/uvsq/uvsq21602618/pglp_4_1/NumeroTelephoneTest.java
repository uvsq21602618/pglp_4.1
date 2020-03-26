package fr.uvsq.uvsq21602618.pglp_4_1;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
/**
 * Classe de tests pour la classe NumeroTelephone.
 * @author Nathalie
 *
 */
public class NumeroTelephoneTest {
    /**
     * Teste le méthode getDescriptif.
     */
    @Test
    public void getDescriptifTest() {
        NumeroTelephone tel = new NumeroTelephone("fixe", "0167874973");
        String expected = "fixe";
        assertEquals(expected, tel.getDescriptif());
    }
    /**
     * Teste la méthode getNumeroTest.
     */
    @Test
    public void getNumeroTest() {
        NumeroTelephone tel = new NumeroTelephone("fixe", "0167874973");
        String expected = "0167874973";
        assertEquals(expected, tel.getNumero());
    }
}
