
public class Brigand extends Humains{
	private String look = "méchant";
	private double recompense = 100;
	private boolean prison;
	
	public Brigand(){
		super("Roger","Wisky");
	}
	
	public String kidnapper(){
		return "Ah, ah ! " + super.quelEstTonNom() + " tu est mienne désormais !";
	}
	
	public String emprisonier(){
		prison = true ; 
		return "Damned, je suis fait !" + super.quelEstTonNom() +  ", tu m'as eu !";
	}
	
	
}
