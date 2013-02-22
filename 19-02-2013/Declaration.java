public class Declaration {
	
	private String nomIdent;
	private int type;
	
	public void affecteNomIdent(String s) {
		nomIdent = s;
	}

	
	public void ajoutConstanteVar(String s) {
		Ident i = Yaka.tabIdent.chercheIdent(s);
		Yaka.tabIdent.rangeIdent(nomIdent,i);
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
