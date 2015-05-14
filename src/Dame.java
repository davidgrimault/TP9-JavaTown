
public class Dame extends Humains{
	private String couleurRobe;
	private boolean Etat;
	
	public Dame (String uneCouleurRobe){		
		super("Mary","Coca-cola");
		couleurRobe=uneCouleurRobe;
	}
	
	public void enlever(){
		if (Etat == false){
			Etat = true;
			super.parle("AAaaAAaaAAHH !! On m'enl�ve ! A l'aide.");
		}
		else{
			super.parle("AAaaAAaaAAHH !! On m'enl�ve encore ! A l'aide.");
		}
	}
	
	public void liberer (){
		Etat = false;
		super.parle("AAaaahh !! , merci " + super.quelEstTonNom() + " de m'avoir lib�rer");
	}
	
	public void setCouleurRobe(String couleur){
		couleurRobe = couleur ;
	}
	
	public void afficheCouleur(){
		super.parle("Regardez ma nouvelle robe " + couleurRobe + " !");
	}
}
