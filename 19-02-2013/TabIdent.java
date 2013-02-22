import java.util.HashMap;
import java.util.Map;


public class TabIdent {
	private Map<String,Ident> table;
	private int nbVar;
	private int offsetCur;
	
	private TabIdent() {
		table = new HashMap<String,Ident>();
		nbVar = 0;
		offsetCur = 0;
	}
	
	public TabIdent(int taille) {}
	public Ident chercheIdent(String clef) {
		return table.get(clef);
	}
	public boolean existeIdent(String clef) {
		return 	table.containsKey(clef);
	}
	public void rangeIdent(String clef, Ident id) throws DeclarationException {
		if(existeIdent(clef))
			throw new DeclarationException();			
		table.put(clef, id);
	}
	
}
	
