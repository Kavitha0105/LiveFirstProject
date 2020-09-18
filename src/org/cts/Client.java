package org.cts;

public class Client extends Company{
	public void clientid() {
		System.out.println("Client Id is 143");
	}
	public void clientName() {
		System.out.println("clientName is TCS Client");
	}
	public static void main(String[] args) {
		Client c = new Client();
		c.clientid();
		c.clientName();
		c.compId();
		c.compName();
	}

}
