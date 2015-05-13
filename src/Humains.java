
public class Humains {
	private String nom;

	private String boissonFavorite ="eau";
	
	public Humains(String unNom ,String uneBoissonFavorite){
		nom=unNom;
		boissonFavorite = uneBoissonFavorite;
	}
	
	public void parle(String text){
		System.out.println(nom +" - "+ text);
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
