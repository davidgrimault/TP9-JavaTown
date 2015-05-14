
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
		parle("Bonjour je m'apelle " + nom + " et ma boisson farovite est " + boissonFavorite + ".");
	}
	
	public void boire(){
		parle("Ah un bon verre de " + boissonFavorite + " ! GLOUPS !");
	}
	public String quelEstTonNom(){
		return nom;
	}

	public String quelEstTaBoissonFavorite(){
		return boissonFavorite;
	}

	




	
}
