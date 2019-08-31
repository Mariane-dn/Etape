
public class MainEtape {

	public static void main(String[] args) {
		System.out.println("Début");
		int lnNumEtape;
		
		lnNumEtape = 1;
		Encouragements(lnNumEtape);
		
		lnNumEtape = 2;
		Encouragements(lnNumEtape);
		
		lnNumEtape = 3;
		Encouragements(lnNumEtape);
		
		lnNumEtape = 4;
		Encouragements(lnNumEtape);
		
		lnNumEtape = 5;
		Encouragements(lnNumEtape);
		
		System.out.println("Fin");	
	}
	
	public static void Encouragements(int anNumEtape) {
		System.out.println("");
		System.out.println("Etape n°" + anNumEtape);
		System.out.println("------------------------------------------------------------------------");
		System.out.println("");
		System.out.println("BRAVO !");
		System.out.println("");
		System.out.println("Vous avez terminé cette étape avec succès");
		System.out.println("");
		System.out.println("Nous passons maintenant à l'étape suivante.");
		System.out.println("");
		System.out.println("------------------------------------------------------------------------");
		System.out.println("");
		
	}

}
