public abstract class Ident {
	
	/*private String nom;*/
	private int type;
	private int valeur; //également utilisé pour l'offset
	
	public Ident( int t, int val) {
	
		this.type = t;
		this.valeur = val;
	}
	
	public getVal() {
		return this.valeur;
	}
	
	public abstract boolean isConst();
}
