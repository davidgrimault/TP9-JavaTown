
public class Brigand extends Humains{
	private String look = "m�chant";
	private int nbDameEnleve;
	private double recompense = 100;
	private boolean prison;
	
	public Brigand(){
		super("Roger","Wisky");
	}
	
	public void kidnapper(){
		super.parle("Ah, ah ! " + super.quelEstTonNom() + " tu est mienne d�sormais !");
	}
	
	public void emprisonner(){
		prison = true ; 
		super.parle("Damned, je suis fait !" + super.quelEstTonNom() +  ", tu m'as eu !");
	}
	
	
	
	
}
