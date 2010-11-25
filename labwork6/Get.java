package com.lab111.labwork6;
/**
 * The class which represents get request.
 * @author rebelizant
 *
 */
public class Get implements HTTPRequest {
	private String url;
	public String getUrl() {
		return url;
	}
	public void setUrl(String url) {
		this.url = url;
	}
	/**
	 * The constructor of class Get.
	 */
	public Get(String url){
		this.setUrl(url);
	}
	@Override
	public String reply() {
		return "GET";
	}
}
