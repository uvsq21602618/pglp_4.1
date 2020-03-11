package fr.uvsq.uvsq21602618.pglp_4_1;

import java.time.LocalDate;

import fr.uvsq.uvsq21602618.pglp_4_1.Personnel.Builder;

public enum AppSingleton {
	ENVIRONNEMENT;
	
	public void run(String[] args) {
		NumeroTelephone portable = new NumeroTelephone("portable","0651624519");
		Builder secretaire = new Personnel.Builder("SMITH","John", "secrétaire", LocalDate.of(1964,8,25));
		secretaire.numTelephones(portable);
		secretaire.build();
		
		NumeroTelephone portable2 = new NumeroTelephone("portable","0651424519");
		Builder chefDeService = new Personnel.Builder("WHITE","Jim", "chef de service", LocalDate.of(1964,8,25));
		chefDeService.numTelephones(portable2);
		chefDeService.build();
		
		NumeroTelephone portable3 = new NumeroTelephone("portable","0631624519");
		Builder employe = new Personnel.Builder("BLACK","Leah", "employe", LocalDate.of(1964,8,15));
		employe.numTelephones(portable3);
		employe.build();
		
		NumeroTelephone portable4 = new NumeroTelephone("portable","0699624519");
		Builder employe2 = new Personnel.Builder("CASTE","Joe", "employe", LocalDate.of(1964,3,15));
		employe2.numTelephones(portable4);
		employe2.build();
		
		NumeroTelephone portable5 = new NumeroTelephone("portable","0611624519");
		Builder chefDepartement = new Personnel.Builder("MARTIN","Jack", "chef du departement", LocalDate.of(1954,8,25));
		chefDepartement.numTelephones(portable5);
		chefDepartement.build();
		
		NumeroTelephone portable6 = new NumeroTelephone("portable","0611624919");
		Builder chefEquipe = new Personnel.Builder("LOGAN","Max", "chef d'équipe", LocalDate.of(1954,8,25));
		chefEquipe.numTelephones(portable6);
		chefEquipe.build();
		
		GroupePersonnels Departement = new GroupePersonnels();
		GroupePersonnels Service = new GroupePersonnels();
		GroupePersonnels Equipe1 = new GroupePersonnels();
		GroupePersonnels Equipe2 = new GroupePersonnels();
		
		Equipe1.add((Composant) chefEquipe);
		Equipe1.add((Composant) employe);
		Equipe2.add((Composant) employe2);
		
		Service.add((Composant) chefDeService);
		Service.add((Composant) chefEquipe);
		Service.add((Composant) employe);
		Service.add((Composant) employe2);
		Service.add(Equipe1);
		Service.add(Equipe2);
		
		Departement.add((Composant) chefDeService);
		Departement.add((Composant) secretaire);
		Departement.add((Composant) employe);
		Departement.add((Composant) employe2);
		Departement.add((Composant) chefDepartement);
		Departement.add((Composant) chefEquipe);
		Departement.add(Service);
		
	}
	
	public static void main(String[] args) {
		ENVIRONNEMENT.run(args);
	}
}
