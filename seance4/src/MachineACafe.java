public class MachineACafe {
	private State state = new InactifState();
	private int montantEnCours = 0;
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
		 // inactif - collecte
		state.entrerMonnaie(this, piece);
	}
	
	public void selectionnerBoisson(ToucheBoisson toucheBoisson) {
		// pas assez - collecte
		state.selectionnerBoisson(this, toucheBoisson);
	}


	public void rendreMonnaie() {
		//inactif - collecte - pas Assez
		state.rendreMonnaie(this);
	}
	public void setState(State state) {
		this.state = state;
	}

	public void setBoisson(ToucheBoisson boisson) {
		this.boisson = boisson;
	}

	public void setMontantEnCours(int montantEnCours) {
		this.montantEnCours = montantEnCours;
	}

	public int getMontantEnCours() {
		return montantEnCours;
	}

	public ToucheBoisson getBoisson() {
		return boisson;
	}
}
