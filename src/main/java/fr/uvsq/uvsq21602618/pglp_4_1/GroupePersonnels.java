package fr.uvsq.uvsq21602618.pglp_4_1;

import java.util.ArrayList;
import java.util.List;

public class GroupePersonnels implements Composant {
	private List<Composant> children = new ArrayList<Composant>();
	
	public void print() {
		for(Composant composant: children) {
			composant.print();
		}
	}
	
	public void add(Composant composant) {
		children.add(composant);
	}
	
	public void remove(Composant composant) {
		children.remove(composant);
	}

}
