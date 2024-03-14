package application;

public class Loja {
	private static int contId = 0;
	
	private int idLoja;
	private String nomeLoja;
	private String locLoja;
	
	public Loja(String nomeLoja, String locLoja) {
		this.idLoja = ++contId;
		this.nomeLoja = nomeLoja;
		this.locLoja = locLoja;
	}

	public int getIdLoja() {
		return idLoja;
	}

	public String getNomeLoja() {
		return nomeLoja;
	}

	public void setNomeLoja(String nomeLoja) {
		this.nomeLoja = nomeLoja;
	}

	public String getLocLoja() {
		return locLoja;
	}

	public void setLocLoja(String locLoja) {
		this.locLoja = locLoja;
	}
	
	
	
}
