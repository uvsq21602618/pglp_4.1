package fr.uvsq.uvsq21602618.pglp_4_1;

import java.util.ArrayList;
import java.util.List;
import java.util.Collections;
import java.util.Iterator;
/**
 * Représente un groupe de composant.
 * @author Nathalie
 */
public class GroupePersonnels implements Composant {
    /**
     * Liste de composants appartenant à ce groupe de personnels.
     */
    private List<Composant> children = new ArrayList<Composant>();
    /**
     * Nom du groupe de personnels.
     */
    private String nomGroupe;
    /**
     * Constructeur qui créé un groupe de personnels
     * à partir d'un nom.
     * @param nom le nom du groupe de personnels
     */
    public GroupePersonnels(final String nom) {
        this.nomGroupe = nom;
    }
    /**
     * Méthode qui récupère le nom du groupe.
     * @return le nom du groupe
     */
    public String getName() {
        return this.nomGroupe;
    }
    /**
     * Méthode qui affiche le nom de chaque composant.
     */
    public void print() {
        System.out.println("-------" + this.getName() + "-------");
        for (Composant composant: children) {
            composant.print();
        }
    }
    /**
     * Méthode qui retourne la liste des composants du groupe.
     * Cette liste ne peut être modifiée.
     * @return la liste des composants non modifiable
     */
    public List<Composant> getList() {
        return Collections.unmodifiableList(children);
    }
    /**
     * Méthode qui ajoute un composant au groupe.
     * @param composant le composant à ajouter
     */
    public void add(final Composant composant) {
        children.add(composant);
    }
    /**
     * Méthode qui retire un composant du groupe.
     * @param composant le composant à retirer
     */
    public void remove(final Composant composant) {
        children.remove(composant);
    }
    /**
     * Affiche une représentation en profondeur de l'annuaire.
     * Utilisation d'un itérateur.
     */
    public void hierarchie() {
        Iterator<Composant> ite = children.iterator();
        System.out.println("-------" + this.getName() + "-------");
        while (ite.hasNext()) {
            Composant c = ite.next();
            c.print();
        }
    }



}
