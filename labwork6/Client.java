package com.lab111.labwork6;

public class Client {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Handler get1 = new GetHandler(null, "www.myspace.com");
		Handler get2 = new GetHandler(get1, "");
		Handler get3 = new GetHandler(get2, "");
		
		Handler post1 = new PostHandler(get3,true);
		Handler post2 = new PostHandler(post1, false);
		
		Handler head1 = new HeadHandler(post2, false);
		Handler head2 = new HeadHandler(head1, false);
		Handler head3 = new HeadHandler(head2, true);
		
		head3.handleRequest(new Get("www.myspace.com"));
		
		head3.handleRequest(new Head());
		
		head3.handleRequest(new Post());

	}

}
