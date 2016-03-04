package nl.bartpelle.veteres.toolkit.dec.impl.expr;

import nl.bartpelle.veteres.toolkit.dec.Expr;
import nl.bartpelle.veteres.toolkit.dec.Type;
import nl.bartpelle.veteres.toolkit.dec.util.CodePrinter;

/**
 * Created by bart on 7/20/15.
 */
public class VarpExpr extends Expr {

	private int value;

	public VarpExpr(Expr parent, int value) {
		super(parent, Type.INT);

		this.value = value;
	}

	public int value() {
		return value;
	}

	public void toCode(CodePrinter printer) {
		printer.print("varp_" + String.valueOf(value));
	}



}
