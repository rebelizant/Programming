package com.lab111.labwork3;
/**
 * The SimpleExpressionConstant class
 * The primitive class extends abstract class Expression.
 * @author rebelizant
 *
 */
public class SimpleExpressionConstant extends Expression {
	/**
	 * The value of constant.
	 */
	private double constt;
	/**
	 * The constructor of class SimpleExpressionConstant.
	 * @param constt The number.
	 */
	public SimpleExpressionConstant(double constt){
		this.setConstt(constt);
	}
	/**
	 * Setting the constant of this object.
	 * @param constt The number.
	 */
	private void setConstt(double constt){
		this.constt = constt;
	}
	/**
	 * Getting the constant of this object.
	 * @return The number.
	 */
	private double getConstt(){
		return this.constt;
	}
	@Override
	/**
	 * Drawing the expression wich causes this method.
	 */
	public void draw(){
		System.out.print("("+this.getConstt()+")");
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
	 * Return the copy of object of SimpleExpressionConstant.
	 */
	protected Expression clone(){
		return new SimpleExpressionConstant(this.getConstt());
	}
	@Override
	/**
	 * Used for removing the object which causes this method.
	 */
	public void remove(int pos){
		this.remove();
	}
}
