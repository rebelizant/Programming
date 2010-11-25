package com.lab111.labwork3;

public class Main {

	/** 
	 * The testing class.
	 * @param args The command from command line.
	 */
	public static void main(String[] args) {		
		Expression ex = new SimpleExpressionConstant(3);		
		Expression ex1 = new SimpleExpressionVariable("p");		
		Expression ex2 = new SimpleExpressionVariable("n");		
		Expression comp1 = new CompositeExpression(ex, ex2);
		Expression comp2 = new CompositeExpression(ex1,ex2);
		comp1.add(comp2, "*");
		comp1.getExp1().add(ex,"/");
		comp1.getExp2().getExp1().remove();
		comp1.getExp1().getExp1().remove(2);
		comp1.draw();		
	}

}
