public abstract class Ident {
	
	/*private String nom;*/
	protected int genre;
	protected int type;
	protected int valeur; //egalement utilise pour l'offset
	
	public int getVal() {
		return this.valeur;
	}
	
	public int getType() {
		return this.type;
	}
	
	public int getGenre() {
		return this.genre;
	}
	public abstract String toString();
}
