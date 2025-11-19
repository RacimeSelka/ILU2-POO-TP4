package produit;

public enum Unité {
	GRAMME("g"),
	KILOGRAMME("kg"),
	LITRE("l"),
	CENTILITRE("cl"),
	MILLILITRE("ml"),
	PIECE("pièce");
	
	private final String nom;

	private Unité(String nom) {
		this.nom = nom;
	}

	public String getNom() {
		return nom;
	}
	
	
}
