package fr.uvsq.uvsq21602618.pglp_4_1;

public class NumeroTelephone {

	private final String descriptif;
	private final String numero;
	
	public NumeroTelephone(final String descriptif, final String numero) {
		this.descriptif=descriptif;
		this.numero=numero;
	}

	public String getDescriptif() {
		return descriptif;
	}

	public String getNumero() {
		return numero;
	}
}
