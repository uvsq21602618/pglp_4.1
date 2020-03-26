package fr.uvsq.uvsq21602618.pglp_4_1;

import java.time.LocalDate;
import java.util.ArrayList;
/**
 * Classe d'un personnel.
 * Possède un nom et prénom,
 * une fonction, une date de naissance
 * et une liste de numéros de téléphone.
 * @author Nathalie
 */
public final class Personnel implements Composant {
    /**
     * Nom du personnel.
     */
    private final String nom;
    /**
     * Prenom du personnel.
     */
    private final String prenom;
    /**
     * Fonction du personnel.
     */
    private final String fonction;
    /**
     * Date de naissance du personnel.
     */
    private final LocalDate dateNaissance;
    /**
     * Liste de numéros de téléphones avec descriptif.
     */
    private final ArrayList<NumeroTelephone> numTelephones;
    /**
     * Builder qui permet la construction d'un personnel.
     * @author natha
     *
     */
    public static class Builder {
        /**
         * nom.
         */
        private final String nom;
        /**
         * prenom.
         */
        private final String prenom;
        /**
         * fonction.
         */
        private final String fonction;
        /**
         * date de naissance.
         */
        private final LocalDate dateNaissance;
        /**
         * Liste de numéros avec descriptif.
         */
        private final ArrayList<NumeroTelephone> numTelephones;
        /**
         * Constructeur. Utilisation du Builder pour Personnel.
         * @param nom2 le nom
         * @param prm le prenom
         * @param fonc la fonction
         * @param date la date de naissance
         */
        public Builder(final String nom2, final String prm,
                final String fonc,
                final LocalDate date) {
            this.nom = nom2;
            this.prenom = prm;
            this.fonction = fonc;
            this.dateNaissance = date;
            this.numTelephones = new ArrayList<NumeroTelephone>();
        }

        /**
         * Ajoute un numéro de téléphone.
         * @param num le numéro et descriptif
         * @return Builder du Personnel
         */
        public Builder numTelephones(final NumeroTelephone num) {
            this.numTelephones.add(num);
            return this;
        }
        /**
         * Retourne le personnel créé à partir du Builder.
         * @return Personnel
         */
        public Personnel build() {
            return new Personnel(this);
        }
    }
    /**
     * Le constructeur créé un Personnel à partir des informations du builder.
     * @param builder Builder du Personnel
     */
    private Personnel(final Builder builder) {
        nom = builder.nom;
        prenom = builder.prenom;
        fonction = builder.fonction;
        dateNaissance = builder.dateNaissance;
        numTelephones = builder.numTelephones;
    }
    /**
     * Méthode retourne le nom du personnel.
     * @return nom
     */
    public String getNom() {
        return nom;
    }
    /**
     * Méthode retourne le prénom du personnel.
     * @return prenom
     */
    public String getPrenom() {
        return prenom;
    }
    /**
     * Méthode retourne la fonction du personnel.
     * @return fonction
     */
    public String getFonction() {
        return fonction;
    }
    /**
     * Méthode retourne la date de naissance.
     * @return date de naissance
     */
    public LocalDate getDateNaissance() {
        return dateNaissance;
    }
    /**
     * retourne la liste des numéros.
     * @return liste de numéros
     */
    public ArrayList<NumeroTelephone> getNumTelephones() {
        return numTelephones;
    }
    /**
     * Méthode affiche les informations du personnel.
     */
    public void print() {
        System.out.println(this.nom + " " + this.prenom + ": \nfonction: "
        + this.fonction + "\ndate de naissance: "
        + this.dateNaissance + "\n");
    }
}
