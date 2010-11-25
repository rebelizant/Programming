package com.lab111.labwork6;
/**
 * The class which represents the handler of head request.
 * @author rebelizant
 *
 */
public class HeadHandler extends Handler {
	/**
	 * 
	 * The constructor of class HeadHandler.  
	 * @param handler The successor.
	 * @param status The status of capability tp process a request.
	 */
	public HeadHandler(Handler handler, boolean status){
		this.setHandler(handler);
		this.setStatus(status);
	}
	@Override
	public void handleRequest(HTTPRequest request) {
		if(this.hasHandle(request) == true){
			System.out.println("Обробка запиту Head об’єктом класу HeadHandler. Об’єкт : "+this.toString());
			System.out.println();
		} else {
			System.out.println("Передача обробки приймачу!");
			this.getHandler().handleRequest(request);
		}
		
	}
	@Override
	public boolean hasHandle(HTTPRequest request) {
		if(request.reply().equals("HEAD") && this.isStatus()){
			return true;
		}
		return false;
	}
}
