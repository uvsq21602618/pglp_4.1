package fr.uvsq.uvsq21602618.pglp_4_1;

import static org.junit.Assert.assertEquals;

import java.time.LocalDate;

import org.junit.Test;

import fr.uvsq.uvsq21602618.pglp_4_1.Personnel.Builder;
/**
 * Classe de tests pour la classe Personnel.
 * @author Nathalie
 *
 */
public class PersonnelTest {
    /**
     * Teste le constructeur de Personnel utilisant 
     * le pattern Builder.
     */
    @Test
    public void ConstructeurTest() {
        NumeroTelephone portable =
                new NumeroTelephone("portable", "0651624519");
        Builder b = new Builder("SMITH", "John", "secrétaire",
                LocalDate.of(1964, 8, 25));
        b.numTelephones(portable);
        Personnel secretaire = b.build();
        
        String expDesc = "portable";
        String expNum = "0651624519";
        String expNom = "SMITH";
        String expPrenom = "John";
        String expFonction = "secrétaire";
        LocalDate expDate = LocalDate.of(1964, 8, 25);
        
        assertEquals(expDesc, secretaire.getNumTelephones().get(0).getDescriptif());
        assertEquals(expNum, secretaire.getNumTelephones().get(0).getNumero());
        assertEquals(expNom, secretaire.getNom());
        assertEquals(expPrenom, secretaire.getPrenom());
        assertEquals(expFonction, secretaire.getFonction());
        assertEquals(expDate, secretaire.getDateNaissance());
        
    }
}
