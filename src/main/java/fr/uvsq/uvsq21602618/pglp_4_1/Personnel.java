package fr.uvsq.uvsq21602618.pglp_4_1;

import java.time.LocalDate;
import java.util.ArrayList;

public class Personnel {
	private final String nom;
	private final String prenom;
	private final String fonction;
	private final LocalDate dateNaissance;
	private final ArrayList<NumeroTelephone> telephone;
	
	public static class Builder {
		private final String nom;
		private final String prenom;
		private final String fonction;
		private final LocalDate dateNaissance;
		private final ArrayList<NumeroTelephone> telephone;
	}
	
	private Personnel(Builder builder) {
		nom = builder.nom;
		prenom = builder.prenom;
		
	}
}
