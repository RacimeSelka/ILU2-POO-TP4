package produit;

public abstract class Produit implements IProduit {
	
	private String nom;
	private Unité unite;
	
	public Unité getUnite() {
		return unite;
	}

	protected Produit(String nom, Unité unite) {
		this.nom = nom;
		this.unite = unite;
	}

	public String getNom() {
		return nom;
	}
	
	
		
	
	
	
	
}
