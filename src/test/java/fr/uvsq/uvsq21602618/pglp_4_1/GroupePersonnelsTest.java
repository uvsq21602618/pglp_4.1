package fr.uvsq.uvsq21602618.pglp_4_1;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
/**
 * Classe contenant les tests de la classe GroupePersonnels.
 * @author Nathalie
 *
 */
public class GroupePersonnelsTest {
    /**
     * Test de la méthode add.
     */
    @Test
    public void addTest() {
        GroupePersonnels g = new GroupePersonnels("groupe perso");
        GroupePersonnels g2 = new GroupePersonnels("groupe perso2");
        g.add(g2);
        assertEquals(g.getList().get(0), g2);
    }
    /**
     * Test de la méthode remove.
     */
    @Test
    public void removeTest() {
        GroupePersonnels g = new GroupePersonnels("groupe perso");
        GroupePersonnels g2 = new GroupePersonnels("groupe perso2");
        GroupePersonnels g3 = new GroupePersonnels("groupe perso3");
        g.add(g2);
        g.add(g3);
        g.remove(g2);
        assertEquals(g.getList().get(0), g3);
    }
}
