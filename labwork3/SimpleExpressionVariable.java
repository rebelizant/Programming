package com.lab111.labwork3;
/**
 * The SimpleExpressionVariable class
 * The primitive class extends abstract class Expression.
 * @author rebelizant
 *
 */
public class SimpleExpressionVariable extends Expression {
	/**
	 * The variable of this object.
	 */
	private String var;
	/**
	 * The constructor of class SimpleExpressionVariable.
	 * 	 * @param var The variable( type : String ).
	 */
	public SimpleExpressionVariable(String var){
		this.setVar(var);
	}
	/**
	 * Setting the variable of this object.
	 * @param var The variable.
	 */
	private void setVar(String var){
		this.var = var;
	}
	/**
	 * Getting the variable of this object.
	 * @return The variable.
	 */
	private String getVar(){
		return this.var;
	}
	@Override
	/**
	 * Drawing the expression wich causes this method.
	 */
	public void draw(){
		System.out.print("("+this.getVar()+")");
	}
	@Override
	/**
	 * Used for removing the object which causes this method.
	 */
	public void remove(){
		if(this.parent != null){
			if(this.parent.getExp1() == this){
				if(this.parent.getOperation().equals("+") || this.parent.getOperation().equals("-")){
					this.parent.setExp1(new SimpleExpressionConstant(0));
				} else {
					this.parent.setExp1(new SimpleExpressionConstant(1));
				}
			} else {
				if(this.parent.getOperation().equals("+") || this.parent.getOperation().equals("-")){
					this.parent.setExp2(new SimpleExpressionConstant(0));
				} else {
					this.parent.setExp2(new SimpleExpressionConstant(1));
				}
			}
		}
	}
	@Override
	/**
	 * Return the copy of object of SimpleExpressionVariable.
	 */
	protected Expression clone(){
		return new SimpleExpressionVariable(this.getVar());
	}
	@Override
	/**
	 * Used for removing the object which causes this method.
	 */
	public void remove(int pos){
		this.remove();
	}
}
