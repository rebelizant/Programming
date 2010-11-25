package com.lab111.labwork6;
/**
 * The class which represents the handler of post request.
 * @author rebelizant
 *
 */
public class PostHandler extends Handler {
	/**
	 * 
	 * The constructor of class PostHandler.  
	 * @param handler The successor.
	 * @param status The status of capability tp process a request.
	 */
	public PostHandler(Handler handler, boolean status){
		this.setHandler(handler);
		this.setStatus(status);
	}
	@Override
	public void handleRequest(HTTPRequest request) {
		if(this.hasHandle(request) == true){
			System.out.println("Обробка запиту Post об’єктом класу PostHandler. Об’єкт : "+this.toString());
		} else {
			System.out.println("Передача обробки приймачу!");
			this.getHandler().handleRequest(request);
		}
		
	}
	@Override
	public boolean hasHandle(HTTPRequest request) {
		if(request.reply().equals("POST") && this.isStatus()){
			return true;
		}
		return false;
	}
}
