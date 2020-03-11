package fr.uvsq.uvsq21602618.pglp_4_1;

import java.time.LocalDate;

import fr.uvsq.uvsq21602618.pglp_4_1.Personnel.Builder;

public enum AppSingleton {
	ENVIRONNEMENT;
	
	public void run(String[] args) {
		NumeroTelephone portable = new NumeroTelephone("portable","0651624519");
		Builder p = new Personnel.Builder("SMITH","John", "secrétaire", LocalDate.of(1964,8,25));
		p.numTelephones(portable);
		p.build();
		
	}
	
	public static void main(String[] args) {
		ENVIRONNEMENT.run(args);
	}
}
