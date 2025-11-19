package produit;

public class Poisson extends Produit {
	
	private String datePeche;
	
	

	public Poisson(String datePeche) {
		super("poisson", Unité.PIECE);
		this.datePeche=datePeche;
	}
	
	public String decrireProduit() {
		return ("Poisson pêchés "+datePeche);
	}
	public int calculerPrix(int prix) {
		return prix;
	}
	
}
