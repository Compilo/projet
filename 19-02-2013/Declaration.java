public class Declaration() {
	
	private String nomIdent;
	
	public void affecteNomIdent(Sring s) {
		nomIdent = s;
	}

	
	public void ajoutConstanteVar(String s) {
		Yaka.tabIdent(
	}
	
	public void ajoutConstanteEnt(Integer i ) {
		Yaka.tabIdent.rangeIdent(nomIdent, new IdConst(Constants.ENTIER,i));
	}
	
	public void ajoutConstanteBool(Boolean b) {
		int var;
		if (b)
			var = Constants.VRAI;
		else
			var = Constants.FAUX;
		Yaka.tabIdent.rangeIdent(nomIdent, new IdConst(Constants.BOOLEEN,var));
	}
}
