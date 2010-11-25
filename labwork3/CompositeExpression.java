package com.lab111.labwork3;
/**
 * The class CompositeExpression
 * Composes primitive and compound objects
 * Extends abstract class Expression.
 * @author rebelizant
 *
 */
public class CompositeExpression extends Expression {
	/**
	 * The constructor of class CompositeExpression.
	 * @param exp1 The expression.
	 * @param exp2 The expression.
	 */
	public CompositeExpression(Expression exp1, Expression exp2){
		this.setExp1(exp1.clone());
		this.exp2 = exp2.clone();
		this.getExp1().parent = this;
		this.getExp2().parent = this;
	}
	/**
	 * The Constructor of class CompositeExpression.
	 * @param exp1 The object of Expression.
	 * @param exp2 The object of Expression. 
	 * @param operation The arithmetic sign.
	 */
	public CompositeExpression(Expression exp1, Expression exp2, String operation){
		this(exp1, exp2);	
		this.setOperation(operation);
	}
	@Override
	/**
	 * Used for adding the new expression to this expression.
	 * @param exp The object of Expression.
	 */
	public void add(Expression exp){
		Expression exp1 = exp.clone();
		this.setExp1(this.clone());
		this.setExp2(exp1);
		this.getExp1().parent = this;
		this.getExp2().parent = this;
	}
	@Override
	/**
	 * Used for adding the new expression to this expression.
	 * @param exp The object of Expression.
	 * @param operation The arithmetic sign.
	 */
	public void add(Expression exp, String operation){
		this.add(exp);
		this.setOperation(operation);
	}
	@Override
	/**
	 * Return the copy of object of CompositeExpression.
	 */
	protected Expression clone(){
		return new CompositeExpression(this.getExp1(), this.getExp2(),this.getOperation());		
	}
	@Override
	/**
	 * Used for removing the object which causes this method.
	 */
	public void remove(){
		if(this.parent != null){
			if(this.parent.getExp1() == this){
				this.parent.remove(1);
			} else {
				this.parent.remove(2);
			}
		} else {
			this.setExp1(null);
			this.setExp2(null);
		}
	}
	@Override
	/**
	 * Used for removing left of right child node of this node.
	 * @param pos Can only be 1 or 2. The left child node - 1. The right child node - 2.
	 */
	public void remove(int pos){
		switch(pos){
			case 1:
				if(this.operation.equals("+") || this.operation.equals("-")){
					this.setExp1(new SimpleExpressionConstant(0));
				} else {
					this.setExp1(new SimpleExpressionConstant(1));
				}
				break;
			case 2:
				if(this.operation.equals("+") || this.operation.equals("-")){
					this.setExp2(new SimpleExpressionConstant(0));
				} else {
					this.setExp2(new SimpleExpressionConstant(1));
				}
				break;
			default:
				System.out.println("Wrong! The node of binary tree has only two child nodes!!!");				
		}			
	}
	@Override
	/**
	 * Drawing the expression wich causes this method.
	 */
	public void draw(){
		System.out.print("(");
		this.getExp1().draw();
		System.out.print(this.getOperation());
		this.exp2.draw();
		System.out.print(")");
	}
}
