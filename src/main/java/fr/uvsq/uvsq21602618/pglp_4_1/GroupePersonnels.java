package fr.uvsq.uvsq21602618.pglp_4_1;

import java.util.ArrayList;
import java.util.List;
import java.util.Collections;
import java.util.Iterator;

public class GroupePersonnels implements Composant {
	private List<Composant> children = new ArrayList<Composant>();
	private String nomGroupe;
	
	public GroupePersonnels(String nom) {
		this.nomGroupe = nom;
	}
	
	public String getName() {
		return this.nomGroupe;
	}
	
	public void print() {
		System.out.println("-------" + this.getName() +"-------");
		for(Composant composant: children) {
			composant.print();
		}
	}
	
	public List<Composant> getList() {
		return Collections.unmodifiableList(children);
	}
	
	public void add(Composant composant) {
		children.add(composant);
	}
	
	public void remove(Composant composant) {
		children.remove(composant);
	}
	
	public void hierarchie() {
		Iterator<Composant> ite = children.iterator();
		System.out.println("-------" + this.getName() + "-------");
		while(ite.hasNext()) {
			Composant c = ite.next();
			c.print();
		}
		
	}
	
	

}
