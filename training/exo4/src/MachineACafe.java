public class MachineACafe {
	public final int idle = 0;
	public final int collecte = 1;
	public final int pasAssez = 2;
	
	private int montantEnCours = 0;

	private State etatCourant = new IdleState();
	private ToucheBoisson boisson = null;
	
	public void afficherMontant() {
		System.out.println(montantEnCours + " cents disponibles");
	}
	
	public void afficherRetour() {
		System.out.println(montantEnCours + " cents rendus");
	}
	
	public void afficherPasAssez(ToucheBoisson toucheBoisson) {
		System.out.println("Vous n'avez pas introduit un montant suffisant pour un " + toucheBoisson);
		System.out.println("Il manque encore " + (toucheBoisson.getPrix() - montantEnCours) + " cents");
	}

	public void afficherBoisson(ToucheBoisson toucheBoisson) {
		System.out.println("Voici un " + toucheBoisson);
		
	}

	public void entrerMonnaie(Piece piece) {
		etatCourant.entrerMonnaie(piece, this);
	}
	
	public void selectionnerBoisson(ToucheBoisson toucheBoisson) {
		etatCourant.selectionnerBoisson(toucheBoisson, this);

	}
	
	public void rendreMonnaie() {
		etatCourant.rendreMonnaie(this);

	}

	public int getMontantEnCours() {
		return montantEnCours;
	}

	public ToucheBoisson getBoisson() {
		return boisson;
	}

	public void setBoisson(ToucheBoisson boisson) {
		this.boisson = boisson;
	}

	public void setEtatCourant(State etatCourant) {
		this.etatCourant = etatCourant;
	}

	public void setMontantEnCours(int montantEnCours) {
		this.montantEnCours = montantEnCours;
	}

	public State getEtatCourant() {
		return etatCourant;
	}
}
