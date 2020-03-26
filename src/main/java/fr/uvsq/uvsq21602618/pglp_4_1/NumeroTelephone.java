package fr.uvsq.uvsq21602618.pglp_4_1;
/**
 * Classe qui représente le numéro de téléphone.
 * @author natha
 *
 */
public class NumeroTelephone {
    /**
     * Le type de numéro (fixe, portable...).
     */
    private final String descriptif;
    /**
     * Le numéro en lui-même avec des chiffres.
     */
    private final String numero;
    /**
     * Le constructeur du numéro de téléphone.
     * @param desc la description du numéro (fixe, portable ...)
     * @param num le numéro de téléphones
     */
    public NumeroTelephone(final String desc, final String num) {
        this.descriptif = desc;
        this.numero = num;
    }
    /**
     * Méthode pour récupérer le descriptif du numéro.
     * @return string le descriptif
     */
    public String getDescriptif() {
        return descriptif;
    }
    /**
     * Méthode pour récupérer le numéro de téléphone.
     * @return string le numéro
     */
    public String getNumero() {
        return numero;
    }
}
