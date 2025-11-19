package produit;

public interface IProduit {
	public Unité getUnite() ;

	

	public String getNom() ;
	
	public  String decrireProduit() ;
	
	public  int calculerPrix(int prix);
}
