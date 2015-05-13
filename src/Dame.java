
public class Dame extends Humains{
	private String couleurRobe;
	private boolean Etat;
	
	public Dame (String uneCouleurRobe){		
		super("Mary","Coca-cola");
		couleurRobe=uneCouleurRobe;
	}
	
	public String enlever(){
		if (Etat == false){
			Etat = true;
			return "AAaaAAaaAAHH !! On m'enlève ! A l'aide.";
		}
		else{
			return "AAaaAAaaAAHH !! On m'enlève encore ! A l'aide.";
		}
	}
	
	public String liberer (){
		Etat = false;
		return "AAaaahh !! , je te remrcie de m'avoir libéré";
	}
}
