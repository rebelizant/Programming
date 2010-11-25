package com.lab111.labwork6;
/**
 * The class which represents the handler of get request.
 * @author rebelizant
 *
 */
public class GetHandler extends Handler {
	public String getUrl() {
		return url;
	}
	public void setUrl(String url) {
		this.url = url;
	}
	private String url;
	/**
	 * The constructor of class GetHandler.  
	 * @param handler The successor.
	 * @param status The status of capability tp process a request.
	 */
	public GetHandler(Handler handler, String url){
		this.setHandler(handler);
		this.setUrl(url);
	}
	@Override
	public void handleRequest(HTTPRequest request) {
		if(this.hasHandle(request) == true){
			System.out.println("Обробка запиту Get об’єктом класу GetHandler. Об’єкт :"+this.toString());
			System.out.println();
		} else {
			System.out.println("Передача обробки приймачу!");
			this.getHandler().handleRequest(request);
		}
	}
	@Override
	public boolean hasHandle(HTTPRequest request) {
		if(request.reply().equals("GET") && this.isStatus() ){
			return true;
		}
		return false;
	}
}
