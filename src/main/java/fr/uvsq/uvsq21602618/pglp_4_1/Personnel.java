package fr.uvsq.uvsq21602618.pglp_4_1;

import java.time.LocalDate;
import java.util.ArrayList;

public class Personnel {
	private final String nom;
	private final String prenom;
	private final String fonction;
	private final LocalDate dateNaissance;
	private final ArrayList<NumeroTelephone> numTelephones;
	
	public static class Builder {
		private final String nom;
		private final String prenom;
		private final String fonction;
		private final LocalDate dateNaissance;
		private final ArrayList<NumeroTelephone> numTelephones;
		
		public Builder(String nom, String prenom, String fonction, LocalDate dateNaissance, ArrayList<NumeroTelephone> numTelephones) {
			this.nom = nom;
			this.prenom = prenom;
			this.fonction = fonction;
			this.dateNaissance= dateNaissance;
			this.numTelephones= numTelephones;
		}
		
		public Personnel build() {
			return new Personnel(this);
		}
	}
	
	private Personnel(Builder builder) {
		nom = builder.nom;
		prenom = builder.prenom;
		
	}
}
