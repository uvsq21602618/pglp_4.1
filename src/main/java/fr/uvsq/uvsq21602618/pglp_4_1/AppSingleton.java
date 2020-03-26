package fr.uvsq.uvsq21602618.pglp_4_1;

import java.time.LocalDate;
import java.util.Iterator;

import fr.uvsq.uvsq21602618.pglp_4_1.Personnel.Builder;
/*
 * Singleton contenant le main.
 */
public enum AppSingleton {
	/*
	 * L'enum qui contient le code du main.
	 */
	ENVIRONNEMENT;
	/*
	 * Execution du programme.
	 */
	public void run(String[] args) {
		NumeroTelephone portable = new NumeroTelephone("portable","0651624519");
		Builder b = new Builder("SMITH","John", "secrétaire", LocalDate.of(1964,8,25));
		b.numTelephones(portable);
		Personnel secretaire = b.build();
		
		NumeroTelephone portable2 = new NumeroTelephone("portable","0651424519");
		Builder b2 = new Builder("WHITE","Jim", "chef de service", LocalDate.of(1964,8,25));
		b2.numTelephones(portable2);
		Personnel chefDeService = b2.build();
		
		NumeroTelephone portable3 = new NumeroTelephone("portable","0631624519");
		Builder b3 = new Builder("BLACK","Leah", "employe", LocalDate.of(1964,8,15));
		b3.numTelephones(portable3);
		Personnel employe = b3.build();
		
		NumeroTelephone portable4 = new NumeroTelephone("portable","0699624519");
		Builder b4 = new Builder("CASTEL","Joe", "employe", LocalDate.of(1964,3,15));
		b4.numTelephones(portable4);
		Personnel employe2 = b4.build();
		
		NumeroTelephone portable5 = new NumeroTelephone("portable","0611624519");
		Builder b5 = new Builder("MARTIN","Jack", "chef du departement", LocalDate.of(1954,8,25));
		b5.numTelephones(portable5);
		Personnel chefDepartement =  b5.build();
		
		NumeroTelephone portable6 = new NumeroTelephone("portable","0611624919");
		Builder b6 = new Builder("LOGAN","Max", "chef d'équipe", LocalDate.of(1954,8,25));
		b6.numTelephones(portable6);
		Personnel chefEquipe = b6.build();
		
		GroupePersonnels Departement = new GroupePersonnels("Departement");
		GroupePersonnels Service2 = new GroupePersonnels("Service2");
		GroupePersonnels Service = new GroupePersonnels("Service");
		GroupePersonnels Equipe1 = new GroupePersonnels("Equipe1");
		GroupePersonnels Equipe2 = new GroupePersonnels("Equipe2");
		GroupePersonnels Equipe3 = new GroupePersonnels("Equipe3");
		
		Service2.add(Equipe3);
		
		Equipe1.add(chefEquipe);
		Equipe1.add(employe);
		Equipe2.add(employe2);
		
		Service.add(chefDeService);
		Service.add(chefEquipe);
		Service.add(employe);
		Service.add(employe2);
		Service.add(Equipe1);
		Service.add(Equipe2);
		
		Departement.add(chefDeService);
		Departement.add(secretaire);
		Departement.add(employe);
		Departement.add(employe2);
		Departement.add(chefDepartement);
		Departement.add(chefEquipe);
		Departement.add(Service);
		Departement.add(Service2);
		
		//Departement.print();
		
		Departement.hierarchie();
		
	}
	/*
	 * Main.
	 */
	public static void main(String[] args) {
		ENVIRONNEMENT.run(args);
	}

}
