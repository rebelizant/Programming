package com.lab111.labwork3;

/**
 * The abstract class of expression.
 * @author rebelizant
 *
 */
public abstract class Expression {
	/**
	 * The field of operation. Default "+".
	 */
	protected String operation = "+";
	/**
	 * The parent of node.
	 */
	protected Expression parent = null;
	/**
	 * The left child node of node. 
	 */
	protected Expression exp1;
	/**
	 * The right child node of node.
	 */
	protected Expression exp2;
	/**
	 * Return the copy of object of Expression.
	 */
	protected Expression clone(){
		return null;
	}
	/**
	 * Used for setting operation.
	 * @param operation The arithmetic sign.
	 */
	protected void setOperation(String operation){
		this.operation = operation;
	}
	/**
	 * Return the arithmetic sign of this object.
	 * @return The arithmetic sign of this object.
	 */
	protected String getOperation(){
		return this.operation;
	}
	/**
	 * Used for getting the link on the left child node of this node.
	 * @return The link on the left child node of this node.
	 */
	public Expression getExp1() {
		return this.exp1;
	}
	/**
	 * Used for setting the link on the left child node of this node.
	 * @param exp1 The object of Expression.
	 */
	public void setExp1(Expression exp1) {
		this.exp1 = exp1;
	}
	/**
	 * Used for getting the link on the right child node of this node.
	 * @return The link on the left child node of this node.
	 */
	public Expression getExp2() {
		return this.exp2;
	}
	/**
	 * Used for setting the link on the left child node of this node.
	 * @param exp2 The object of class Expression.
	 */
	public void setExp2(Expression exp2) {
		this.exp2 = exp2;
	}
	/**
	 * Used for adding the new expression to this expression.
	 * @param exp The object of Expression.
	 */
	public void add(Expression exp){
		
	}
	/**
	 * Used for adding the new expression to this expression.
	 * @param exp The object of Expression.
	 * @param operation The arithmetic sign.
	 */
	public void add(Expression exp, String operation){
		
	}
	/**
	 * Used for removing left of right child node of this node.
	 * @param pos Can only be 1 or 2. The left child node - 1. The right child node - 2.
	 */
	public void remove( int pos){
		
	}
	/**
	 * Used for removing the object which causes this method.
	 */
	public void remove(){
		
	}
	/**
	 * Drawing the expression wich causes this method.
	 */
	public void draw(){
		
	}
	
	
}
