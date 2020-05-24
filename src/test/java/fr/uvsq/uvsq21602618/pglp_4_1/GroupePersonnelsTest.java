package fr.uvsq.uvsq21602618.pglp_4_1;

import static org.junit.Assert.assertEquals;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.time.LocalDate;

import org.junit.Test;

import fr.uvsq.uvsq21602618.pglp_4_1.Personnel.Builder;
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
    /**
     * Test de la methode hierarchie.
     */
    @Test
    public void hierarchieTest() {
        NumeroTelephone portable =
                new NumeroTelephone("portable", "0651624519");
        Builder b = new Builder("SMITH", "John", "secrétaire",
                LocalDate.of(1964, 8, 25));
        b.numTelephones(portable);
        Personnel secretaire = b.build();
        NumeroTelephone portable2 =
                new NumeroTelephone("portable", "0651424519");
        Builder b2 = new Builder("WHITE", "Jim", "chef de service",
                LocalDate.of(1964, 8, 25));
        b2.numTelephones(portable2);
        Personnel chefDeService = b2.build();
        NumeroTelephone portable3 =
                new NumeroTelephone("portable", "0631624519");
        Builder b3 = new Builder("BLACK", "Leah", "employe",
                LocalDate.of(1964, 8, 15));
        b3.numTelephones(portable3);
        Personnel employe = b3.build();

        NumeroTelephone portable4 =
                new NumeroTelephone("portable", "0699624519");
        Builder b4 = new Builder("CASTEL", "Joe", "employe",
                LocalDate.of(1964, 3, 15));
        b4.numTelephones(portable4);
        Personnel employe2 = b4.build();

        NumeroTelephone portable5 =
                new NumeroTelephone("portable", "0611624519");
        Builder b5 = new Builder("MARTIN", "Jack",
                "chef du departement",
                LocalDate.of(1954, 8, 25));
        b5.numTelephones(portable5);
        Personnel chefDepartement =  b5.build();

        NumeroTelephone portable6 =
                new NumeroTelephone("portable", "0611624919");
        Builder b6 = new Builder("LOGAN", "Max", "chef d'équipe",
                LocalDate.of(1954, 8, 25));
        b6.numTelephones(portable6);
        Personnel chefEquipe = b6.build();

        GroupePersonnels departement =
                new GroupePersonnels("Departement");
        GroupePersonnels service2 =
                new GroupePersonnels("Service2");
        GroupePersonnels service =
                new GroupePersonnels("Service");
        GroupePersonnels equipe1 =
                new GroupePersonnels("Equipe1");
        GroupePersonnels equipe2 =
                new GroupePersonnels("Equipe2");
        GroupePersonnels equipe3 =
                new GroupePersonnels("Equipe3");

        service2.add(equipe3);

        equipe1.add(chefEquipe);
        equipe1.add(employe);
        equipe2.add(employe2);

        service.add(chefDeService);
        service.add(chefEquipe);
        service.add(employe);
        service.add(employe2);
        service.add(equipe1);
        service.add(equipe2);

        departement.add(chefDeService);
        departement.add(secretaire);
        departement.add(employe);
        departement.add(employe2);
        departement.add(chefDepartement);
        departement.add(chefEquipe);
        departement.add(service);
        departement.add(service2);

        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));
        String expected = "-------Departement-------\r\n"
                + "WHITE Jim: \n"
                + "fonction: chef de service\n"
                + "date de naissance: 1964-08-25\n"
                + "\r\n"
                + "SMITH John: \n"
                + "fonction: secrétaire\n"
                + "date de naissance: 1964-08-25\n"
                + "\r\n"
                + "BLACK Leah: \n"
                + "fonction: employe\n"
                + "date de naissance: 1964-08-15\n"
                + "\r\n"
                + "CASTEL Joe: \n"
                + "fonction: employe\n"
                + "date de naissance: 1964-03-15\n"
                + "\r\n"
                + "MARTIN Jack: \n"
                + "fonction: chef du departement\n"
                + "date de naissance: 1954-08-25\n"
                + "\r\n"
                + "LOGAN Max: \n"
                + "fonction: chef d'équipe\n"
                + "date de naissance: 1954-08-25\n"
                + "\r\n"
                + "-------Service-------\r\n"
                + "WHITE Jim: \n"
                + "fonction: chef de service\n"
                + "date de naissance: 1964-08-25\n"
                + "\r\n"
                + "LOGAN Max: \n"
                + "fonction: chef d'équipe\n"
                + "date de naissance: 1954-08-25\n"
                + "\r\n"
                + "BLACK Leah: \n"
                + "fonction: employe\n"
                + "date de naissance: 1964-08-15\n"
                + "\r\n"
                + "CASTEL Joe: \n"
                + "fonction: employe\n"
                + "date de naissance: 1964-03-15\n"
                + "\r\n"
                + "-------Equipe1-------\r\n"
                + "LOGAN Max: \n"
                + "fonction: chef d'équipe\n"
                + "date de naissance: 1954-08-25\n"
                + "\r\n"
                + "BLACK Leah: \n"
                + "fonction: employe\n"
                + "date de naissance: 1964-08-15\n"
                + "\r\n"
                + "-------Equipe2-------\r\n"
                + "CASTEL Joe: \n"
                + "fonction: employe\n"
                + "date de naissance: 1964-03-15\n"
                + "\r\n"
                + "-------Service2-------\r\n"
                + "-------Equipe3-------\r\n";
        departement.hierarchie();
        assertEquals(expected, outContent.toString());
    }
}
