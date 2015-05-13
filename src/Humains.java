
public class Humains {
	private String nom;
	private String boissonFavorite = "eau";

	public Humains(String nom , String boissonFavorite) {
		this.nom = nom ;
		this.boissonFavorite = boissonFavorite;
	}

	public void parle( String texte) {
		System.out.println(nom + " - " +texte);
	}

	public void presenter(){
		System.out.println("Bonjour je m'apelle " + nom + " et ma boisson farovite est " + boissonFavorite + ".");
	}
	
	public void boire(){
		System.out.println("Ah un bon verre de " + boissonFavorite + " ! GLOUPS !");
	}
	public String quleEstTonNom(){
		return nom;
	}

	






}
